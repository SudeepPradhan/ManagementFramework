/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.Validator;
import interfaces.ValidateOutput;

/**
 *
 * @author Sudeep
 */
public interface Validatable<T>
{
    ValidateOutput validate(Validator<T> validator);
}
