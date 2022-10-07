package com.leonardo.toolsChallenge;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leonardo.toolsChallenge.controller.IPagamentoController;
import com.leonardo.toolsChallenge.controller.impl.PagamentoController;
import com.leonardo.toolsChallenge.enums.EnumStatusTransacao;
import com.leonardo.toolsChallenge.enums.EnumTipoPagamento;
import com.leonardo.toolsChallenge.model.Descricao;
import com.leonardo.toolsChallenge.model.FormaPagamento;
import com.leonardo.toolsChallenge.model.Pagamento;
import com.leonardo.toolsChallenge.model.Transacao;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;

public class PagamentoControllerTest extends ToolsChallengeApplicationTests {

    private MockMvc mockMvc;

    @Autowired
    private PagamentoController pagamentoController;

    @BeforeEach
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(pagamentoController).build();
    }

    @Test
    public void criarPagamentoComDadosCorretos_RetornarStatusCode201() throws Exception {
        Pagamento usuario = new Pagamento(null, new Transacao(null, "1234123412341234", new Descricao(null, BigDecimal.ZERO, null, "1234", 123, "123453", EnumStatusTransacao.AUTORIZADO), new FormaPagamento(null, EnumTipoPagamento.AVISTA, 1)));

        String json = new ObjectMapper().writeValueAsString(usuario);

        this.mockMvc.perform(MockMvcRequestBuilders.post(IPagamentoController.PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
                )
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    public void criarPagamentoComDadosIncorretos_RetornarStatusCode400() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post(IPagamentoController.PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("")
                )
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void estornarPagamento_RetornarStatusCode200() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.put(IPagamentoController.PATH.concat("/1/estornar")))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void estornarPagamento_RetornarStatusCode400() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.put(IPagamentoController.PATH.concat("/undefined/estornar")))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void buscarPorId_RetornarStatusCode200() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get(IPagamentoController.PATH.concat("/1")))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void buscarPorId_RetornarStatusCode400() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get(IPagamentoController.PATH.concat("/undefined")))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

}
