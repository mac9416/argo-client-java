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


package io.argoproj.workflow.apis;

import io.argoproj.workflow.ApiCallback;
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.ApiResponse;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.Pair;
import io.argoproj.workflow.ProgressRequestBody;
import io.argoproj.workflow.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.argoproj.workflow.models.InfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoServiceApi {
    private ApiClient localVarApiClient;

    public InfoServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InfoServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getInfo
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInfoCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInfoValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getInfoCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @return InfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
     </table>
     */
    public InfoResponse getInfo() throws ApiException {
        ApiResponse<InfoResponse> localVarResp = getInfoWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @return ApiResponse&lt;InfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InfoResponse> getInfoWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getInfoValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInfoAsync(final ApiCallback<InfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInfoValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<InfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
