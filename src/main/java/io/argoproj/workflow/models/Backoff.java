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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Backoff
 */

public class Backoff {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_FACTOR = "factor";
  @SerializedName(SERIALIZED_NAME_FACTOR)
  private Integer factor;

  public static final String SERIALIZED_NAME_MAX_DURATION = "maxDuration";
  @SerializedName(SERIALIZED_NAME_MAX_DURATION)
  private String maxDuration;


  public Backoff duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public Backoff factor(Integer factor) {
    
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * @return factor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFactor() {
    return factor;
  }


  public void setFactor(Integer factor) {
    this.factor = factor;
  }


  public Backoff maxDuration(String maxDuration) {
    
    this.maxDuration = maxDuration;
    return this;
  }

   /**
   * Get maxDuration
   * @return maxDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxDuration() {
    return maxDuration;
  }


  public void setMaxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backoff backoff = (Backoff) o;
    return Objects.equals(this.duration, backoff.duration) &&
        Objects.equals(this.factor, backoff.factor) &&
        Objects.equals(this.maxDuration, backoff.maxDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, factor, maxDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backoff {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
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

