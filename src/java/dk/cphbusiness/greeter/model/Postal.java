package dk.cphbusiness.greeter.model;

public class Postal {
  private int code;
  private String district;

  public Postal() { }

  public Postal(int code, String district) {
    this.code = code;
    this.district = district;
    }

  public int getCode() {
    return code;
    }

  public String getDistrict() {
    return district;
    }
  
  }
