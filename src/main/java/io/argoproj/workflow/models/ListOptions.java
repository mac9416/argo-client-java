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
 * ListOptions is the query options to a standard REST list call.
 */
@ApiModel(description = "ListOptions is the query options to a standard REST list call.")

public class ListOptions {
  public static final String SERIALIZED_NAME_ALLOW_WATCH_BOOKMARKS = "allowWatchBookmarks";
  @SerializedName(SERIALIZED_NAME_ALLOW_WATCH_BOOKMARKS)
  private Boolean allowWatchBookmarks;

  public static final String SERIALIZED_NAME_CONTINUE = "continue";
  @SerializedName(SERIALIZED_NAME_CONTINUE)
  private String _continue;

  public static final String SERIALIZED_NAME_FIELD_SELECTOR = "fieldSelector";
  @SerializedName(SERIALIZED_NAME_FIELD_SELECTOR)
  private String fieldSelector;

  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private String labelSelector;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private String limit;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private String timeoutSeconds;

  public static final String SERIALIZED_NAME_WATCH = "watch";
  @SerializedName(SERIALIZED_NAME_WATCH)
  private Boolean watch;


  public ListOptions allowWatchBookmarks(Boolean allowWatchBookmarks) {
    
    this.allowWatchBookmarks = allowWatchBookmarks;
    return this;
  }

   /**
   * allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta.  +optional
   * @return allowWatchBookmarks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "allowWatchBookmarks requests watch events with type \"BOOKMARK\". Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server's discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored.  This field is beta.  +optional")

  public Boolean getAllowWatchBookmarks() {
    return allowWatchBookmarks;
  }


  public void setAllowWatchBookmarks(Boolean allowWatchBookmarks) {
    this.allowWatchBookmarks = allowWatchBookmarks;
  }


  public ListOptions _continue(String _continue) {
    
    this._continue = _continue;
    return this;
  }

   /**
   * The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.
   * @return _continue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \"next key\".  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications.")

  public String getContinue() {
    return _continue;
  }


  public void setContinue(String _continue) {
    this._continue = _continue;
  }


  public ListOptions fieldSelector(String fieldSelector) {
    
    this.fieldSelector = fieldSelector;
    return this;
  }

   /**
   * Get fieldSelector
   * @return fieldSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldSelector() {
    return fieldSelector;
  }


  public void setFieldSelector(String fieldSelector) {
    this.fieldSelector = fieldSelector;
  }


  public ListOptions labelSelector(String labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
  }


  public ListOptions limit(String limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "limit is a maximum number of responses to return for a list call. If more items exist, the server will set the `continue` field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned.")

  public String getLimit() {
    return limit;
  }


  public void setLimit(String limit) {
    this.limit = limit;
  }


  public ListOptions resourceVersion(String resourceVersion) {
    
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


  public ListOptions timeoutSeconds(String timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Get timeoutSeconds
   * @return timeoutSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(String timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  public ListOptions watch(Boolean watch) {
    
    this.watch = watch;
    return this;
  }

   /**
   * Get watch
   * @return watch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWatch() {
    return watch;
  }


  public void setWatch(Boolean watch) {
    this.watch = watch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOptions listOptions = (ListOptions) o;
    return Objects.equals(this.allowWatchBookmarks, listOptions.allowWatchBookmarks) &&
        Objects.equals(this._continue, listOptions._continue) &&
        Objects.equals(this.fieldSelector, listOptions.fieldSelector) &&
        Objects.equals(this.labelSelector, listOptions.labelSelector) &&
        Objects.equals(this.limit, listOptions.limit) &&
        Objects.equals(this.resourceVersion, listOptions.resourceVersion) &&
        Objects.equals(this.timeoutSeconds, listOptions.timeoutSeconds) &&
        Objects.equals(this.watch, listOptions.watch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOptions {\n");
    sb.append("    allowWatchBookmarks: ").append(toIndentedString(allowWatchBookmarks)).append("\n");
    sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
    sb.append("    fieldSelector: ").append(toIndentedString(fieldSelector)).append("\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    watch: ").append(toIndentedString(watch)).append("\n");
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

