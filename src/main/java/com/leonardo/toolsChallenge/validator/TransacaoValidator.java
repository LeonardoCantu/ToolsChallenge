package com.leonardo.toolsChallenge.validator;

import com.leonardo.toolsChallenge.model.Transacao;
import com.leonardo.toolsChallenge.pattern.validator.IValidator;
import com.leonardo.toolsChallenge.pattern.validator.ValidateFields;

public class TransacaoValidator implements IValidator<Transacao> {
    @Override
    public void validarCamposRequeridos(Transacao entidade) {
        ValidateFields validateFields = new ValidateFields();

        validateFields.add(entidade.getCartao(), "Cartão");
        validateFields.add(entidade.getDescricao(), "Descrição");
        validateFields.add(entidade.getFormaPagamento(), "Forma Pagamento");

        validateFields.validate();

    }
}
