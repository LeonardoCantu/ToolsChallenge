package com.leonardo.toolsChallenge.validator;

import com.leonardo.toolsChallenge.model.FormaPagamento;
import com.leonardo.toolsChallenge.pattern.validator.IValidator;
import com.leonardo.toolsChallenge.pattern.validator.ValidateFields;

public class FormaPagamentoValidator implements IValidator<FormaPagamento> {

    @Override
    public void validarCamposRequeridos(FormaPagamento entidade) {
        ValidateFields validateFields = new ValidateFields();

        validateFields.add(entidade.getTipo(), "Tipo");
        validateFields.add(entidade.getParcelas(), "Parcelas");

        validateFields.validate();
    }
}
