package org.edge.json.format;

public enum EdgeFormatIdentifier {
  VERSION(0, "edge-1.0", "edge-json-format version"),
  
  OPCUA_TYPE(10, "opcua", "opcua protocol type"),
	CNC_TYPE(11, "cnc", "CNC protocol type"),
	PLC_TYPE(12, "cnc", "PLC protocol type");
 
  private int code;
  private String value;
  private String description;

  private EdgeFormatIdentifier(int code, String value, String description) {
      this.code = code;
      this.value = value;
      this.description = description;
  }

  public int getCode() {
      return code;
  }

  public String getValue() {
      return value;
  }

  public String getDescription() {
      return description;
  }
}
