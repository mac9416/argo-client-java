/*
 * pkg/apiclient/cronworkflow/cron-proto
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: version not set
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.ItemValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * +protobuf&#x3D;true +protobuf.options.(gogoproto.goproto_stringer)&#x3D;false +k8s:openapi-gen&#x3D;true
 */
@ApiModel(description = "+protobuf=true +protobuf.options.(gogoproto.goproto_stringer)=false +k8s:openapi-gen=true")

public class Item {
  public static final String SERIALIZED_NAME_BOOL_VAL = "boolVal";
  @SerializedName(SERIALIZED_NAME_BOOL_VAL)
  private Boolean boolVal;

  public static final String SERIALIZED_NAME_LIST_VAL = "listVal";
  @SerializedName(SERIALIZED_NAME_LIST_VAL)
  private List<ItemValue> listVal = null;

  public static final String SERIALIZED_NAME_MAP_VAL = "mapVal";
  @SerializedName(SERIALIZED_NAME_MAP_VAL)
  private Map<String, ItemValue> mapVal = null;

  public static final String SERIALIZED_NAME_NUM_VAL = "numVal";
  @SerializedName(SERIALIZED_NAME_NUM_VAL)
  private String numVal;

  public static final String SERIALIZED_NAME_STR_VAL = "strVal";
  @SerializedName(SERIALIZED_NAME_STR_VAL)
  private String strVal;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public Item boolVal(Boolean boolVal) {
    
    this.boolVal = boolVal;
    return this;
  }

   /**
   * Get boolVal
   * @return boolVal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBoolVal() {
    return boolVal;
  }


  public void setBoolVal(Boolean boolVal) {
    this.boolVal = boolVal;
  }


  public Item listVal(List<ItemValue> listVal) {
    
    this.listVal = listVal;
    return this;
  }

  public Item addListValItem(ItemValue listValItem) {
    if (this.listVal == null) {
      this.listVal = new ArrayList<ItemValue>();
    }
    this.listVal.add(listValItem);
    return this;
  }

   /**
   * Get listVal
   * @return listVal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ItemValue> getListVal() {
    return listVal;
  }


  public void setListVal(List<ItemValue> listVal) {
    this.listVal = listVal;
  }


  public Item mapVal(Map<String, ItemValue> mapVal) {
    
    this.mapVal = mapVal;
    return this;
  }

  public Item putMapValItem(String key, ItemValue mapValItem) {
    if (this.mapVal == null) {
      this.mapVal = new HashMap<String, ItemValue>();
    }
    this.mapVal.put(key, mapValItem);
    return this;
  }

   /**
   * Get mapVal
   * @return mapVal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, ItemValue> getMapVal() {
    return mapVal;
  }


  public void setMapVal(Map<String, ItemValue> mapVal) {
    this.mapVal = mapVal;
  }


  public Item numVal(String numVal) {
    
    this.numVal = numVal;
    return this;
  }

   /**
   * Get numVal
   * @return numVal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNumVal() {
    return numVal;
  }


  public void setNumVal(String numVal) {
    this.numVal = numVal;
  }


  public Item strVal(String strVal) {
    
    this.strVal = strVal;
    return this;
  }

   /**
   * Get strVal
   * @return strVal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStrVal() {
    return strVal;
  }


  public void setStrVal(String strVal) {
    this.strVal = strVal;
  }


  public Item type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.boolVal, item.boolVal) &&
        Objects.equals(this.listVal, item.listVal) &&
        Objects.equals(this.mapVal, item.mapVal) &&
        Objects.equals(this.numVal, item.numVal) &&
        Objects.equals(this.strVal, item.strVal) &&
        Objects.equals(this.type, item.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boolVal, listVal, mapVal, numVal, strVal, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    boolVal: ").append(toIndentedString(boolVal)).append("\n");
    sb.append("    listVal: ").append(toIndentedString(listVal)).append("\n");
    sb.append("    mapVal: ").append(toIndentedString(mapVal)).append("\n");
    sb.append("    numVal: ").append(toIndentedString(numVal)).append("\n");
    sb.append("    strVal: ").append(toIndentedString(strVal)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

