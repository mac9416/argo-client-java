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
import io.argoproj.workflow.models.ArchiveStrategy;
import io.argoproj.workflow.models.ArtifactLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Artifact
 */

public class Artifact {
  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private ArchiveStrategy archive;

  public static final String SERIALIZED_NAME_ARTIFACT_LOCATION = "artifactLocation";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_LOCATION)
  private ArtifactLocation artifactLocation;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_GLOBAL_NAME = "globalName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_NAME)
  private String globalName;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public Artifact archive(ArchiveStrategy archive) {
    
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArchiveStrategy getArchive() {
    return archive;
  }


  public void setArchive(ArchiveStrategy archive) {
    this.archive = archive;
  }


  public Artifact artifactLocation(ArtifactLocation artifactLocation) {
    
    this.artifactLocation = artifactLocation;
    return this;
  }

   /**
   * Get artifactLocation
   * @return artifactLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactLocation getArtifactLocation() {
    return artifactLocation;
  }


  public void setArtifactLocation(ArtifactLocation artifactLocation) {
    this.artifactLocation = artifactLocation;
  }


  public Artifact from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public Artifact globalName(String globalName) {
    
    this.globalName = globalName;
    return this;
  }

   /**
   * Get globalName
   * @return globalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGlobalName() {
    return globalName;
  }


  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }


  public Artifact mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public Artifact name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the artifact. must be unique within a template&#39;s inputs/outputs.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the artifact. must be unique within a template's inputs/outputs.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Artifact optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Get optional
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public Artifact path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artifact artifact = (Artifact) o;
    return Objects.equals(this.archive, artifact.archive) &&
        Objects.equals(this.artifactLocation, artifact.artifactLocation) &&
        Objects.equals(this.from, artifact.from) &&
        Objects.equals(this.globalName, artifact.globalName) &&
        Objects.equals(this.mode, artifact.mode) &&
        Objects.equals(this.name, artifact.name) &&
        Objects.equals(this.optional, artifact.optional) &&
        Objects.equals(this.path, artifact.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, artifactLocation, from, globalName, mode, name, optional, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artifact {\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    artifactLocation: ").append(toIndentedString(artifactLocation)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

