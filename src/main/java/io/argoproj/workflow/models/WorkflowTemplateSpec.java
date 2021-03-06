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
import io.argoproj.workflow.models.WorkflowSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkflowTemplateSpec is a spec of WorkflowTemplate.
 */
@ApiModel(description = "WorkflowTemplateSpec is a spec of WorkflowTemplate.")

public class WorkflowTemplateSpec {
  public static final String SERIALIZED_NAME_WORKFLOW_SPEC = "workflowSpec";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_SPEC)
  private WorkflowSpec workflowSpec;


  public WorkflowTemplateSpec workflowSpec(WorkflowSpec workflowSpec) {
    
    this.workflowSpec = workflowSpec;
    return this;
  }

   /**
   * Get workflowSpec
   * @return workflowSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowSpec getWorkflowSpec() {
    return workflowSpec;
  }


  public void setWorkflowSpec(WorkflowSpec workflowSpec) {
    this.workflowSpec = workflowSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTemplateSpec workflowTemplateSpec = (WorkflowTemplateSpec) o;
    return Objects.equals(this.workflowSpec, workflowTemplateSpec.workflowSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTemplateSpec {\n");
    sb.append("    workflowSpec: ").append(toIndentedString(workflowSpec)).append("\n");
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

