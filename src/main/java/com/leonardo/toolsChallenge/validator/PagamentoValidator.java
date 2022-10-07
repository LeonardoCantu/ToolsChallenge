package com.leonardo.toolsChallenge.validator;

import com.leonardo.toolsChallenge.model.Pagamento;
import com.leonardo.toolsChallenge.pattern.exception.ObjectNotFountException;
import com.leonardo.toolsChallenge.pattern.validator.IValidator;
import com.leonardo.toolsChallenge.pattern.validator.ValidateFields;

public class PagamentoValidator implements IValidator<Pagamento> {

    @Override
    public void validarCamposRequeridos(Pagamento entidade) {
        ValidateFields validateFields = new ValidateFields();
        validateFields.add(entidade.getTransacao(), "Transação");

        validateFields.validate();
    }

}
