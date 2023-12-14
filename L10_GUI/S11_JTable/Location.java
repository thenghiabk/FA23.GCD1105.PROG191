/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10_GUI.S11_JTable;

import L10_GUI.S14_JFileChooser.*;
import java.io.Serializable;

/**
 *
 * @author NGHIA NGUYEN
 */
public class Location implements Serializable {
    private String provinceName;
    private String postalCode;

    public Location(String provinceName, String postalCode) {
        this.provinceName = provinceName;
        this.postalCode = postalCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
}
