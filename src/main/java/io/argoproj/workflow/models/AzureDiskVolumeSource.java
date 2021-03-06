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
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 */
@ApiModel(description = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")

public class AzureDiskVolumeSource {
  public static final String SERIALIZED_NAME_CACHING_MODE = "cachingMode";
  @SerializedName(SERIALIZED_NAME_CACHING_MODE)
  private String cachingMode;

  public static final String SERIALIZED_NAME_DISK_NAME = "diskName";
  @SerializedName(SERIALIZED_NAME_DISK_NAME)
  private String diskName;

  public static final String SERIALIZED_NAME_DISK_U_R_I = "diskURI";
  @SerializedName(SERIALIZED_NAME_DISK_U_R_I)
  private String diskURI;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;


  public AzureDiskVolumeSource cachingMode(String cachingMode) {
    
    this.cachingMode = cachingMode;
    return this;
  }

   /**
   * Get cachingMode
   * @return cachingMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCachingMode() {
    return cachingMode;
  }


  public void setCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
  }


  public AzureDiskVolumeSource diskName(String diskName) {
    
    this.diskName = diskName;
    return this;
  }

   /**
   * Get diskName
   * @return diskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiskName() {
    return diskName;
  }


  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }


  public AzureDiskVolumeSource diskURI(String diskURI) {
    
    this.diskURI = diskURI;
    return this;
  }

   /**
   * Get diskURI
   * @return diskURI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiskURI() {
    return diskURI;
  }


  public void setDiskURI(String diskURI) {
    this.diskURI = diskURI;
  }


  public AzureDiskVolumeSource fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Get fsType
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public AzureDiskVolumeSource kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public AzureDiskVolumeSource readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureDiskVolumeSource azureDiskVolumeSource = (AzureDiskVolumeSource) o;
    return Objects.equals(this.cachingMode, azureDiskVolumeSource.cachingMode) &&
        Objects.equals(this.diskName, azureDiskVolumeSource.diskName) &&
        Objects.equals(this.diskURI, azureDiskVolumeSource.diskURI) &&
        Objects.equals(this.fsType, azureDiskVolumeSource.fsType) &&
        Objects.equals(this.kind, azureDiskVolumeSource.kind) &&
        Objects.equals(this.readOnly, azureDiskVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachingMode, diskName, diskURI, fsType, kind, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureDiskVolumeSource {\n");
    sb.append("    cachingMode: ").append(toIndentedString(cachingMode)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    diskURI: ").append(toIndentedString(diskURI)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

