/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
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
 * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 */
@ApiModel(description = "Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.")

public class Preconditions {
  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public Preconditions resourceVersion(String resourceVersion) {
    
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Get resourceVersion
   * @return resourceVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceVersion() {
    return resourceVersion;
  }


  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public Preconditions uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preconditions preconditions = (Preconditions) o;
    return Objects.equals(this.resourceVersion, preconditions.resourceVersion) &&
        Objects.equals(this.uid, preconditions.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceVersion, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preconditions {\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
