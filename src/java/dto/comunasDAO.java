/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.List;

/**
 *
 * @author blood
 */
public interface comunasDAO {
    public List<comunas> getAllByProvinciaId(int provinciaId);
}
