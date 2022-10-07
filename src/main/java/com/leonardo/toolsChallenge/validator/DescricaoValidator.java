package com.leonardo.toolsChallenge.validator;

import com.leonardo.toolsChallenge.enums.EnumStatusTransacao;
import com.leonardo.toolsChallenge.model.Descricao;
import com.leonardo.toolsChallenge.pattern.validator.IValidator;
import com.leonardo.toolsChallenge.pattern.validator.ValidateFields;

public class DescricaoValidator implements IValidator<Descricao> {

    @Override
    public void validarCamposRequeridos(Descricao entidade) {
        ValidateFields validateFields = new ValidateFields();

        validateFields.add(entidade.getValor(), "Valor");
        validateFields.add(entidade.getCodigoAutorizacao(), "Código de Autorização");
        validateFields.add(entidade.getEstabelecimento(), "Estabelecimento");
        validateFields.add(entidade.getNsu(), "NSU");
        validateFields.add(entidade.getStatus(), "Status");

        validateFields.validate();
    }

    public void validarPagamentoPodeSerEstorando(Descricao descricao){
        if(EnumStatusTransacao.CANCELADO.equals(descricao.getStatus())){
            throw new RuntimeException("Pagamento já se encotra estorado.");
        }
    }
}
