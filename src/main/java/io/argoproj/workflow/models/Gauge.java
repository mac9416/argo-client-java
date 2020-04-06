/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: latest
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Gauge
 */

public class Gauge {
  public static final String SERIALIZED_NAME_REALTIME = "realtime";
  @SerializedName(SERIALIZED_NAME_REALTIME)
  private Boolean realtime;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public Gauge realtime(Boolean realtime) {
    
    this.realtime = realtime;
    return this;
  }

   /**
   * Get realtime
   * @return realtime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRealtime() {
    return realtime;
  }


  public void setRealtime(Boolean realtime) {
    this.realtime = realtime;
  }


  public Gauge value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gauge gauge = (Gauge) o;
    return Objects.equals(this.realtime, gauge.realtime) &&
        Objects.equals(this.value, gauge.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realtime, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gauge {\n");
    sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

