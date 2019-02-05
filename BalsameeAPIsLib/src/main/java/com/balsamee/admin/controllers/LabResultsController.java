/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.balsamee.admin.*;
import com.balsamee.admin.models.*;
import com.balsamee.admin.exceptions.*;
import com.balsamee.admin.http.client.HttpClient;
import com.balsamee.admin.http.client.HttpContext;
import com.balsamee.admin.http.request.HttpRequest;
import com.balsamee.admin.http.response.HttpResponse;
import com.balsamee.admin.http.response.HttpStringResponse;
import com.balsamee.admin.http.client.APICallBack;

public class LabResultsController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static LabResultsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the LabResultsController class 
     */
    public static LabResultsController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new LabResultsController();
                }
            }
        }
        return instance;
    }

    /**
     * TODO: Add Description
     * @param    xSessionId    Required parameter: Example: 
     * @param    xAuthenticationToken    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getApiV5ReservationRequests2631LabRequests535TestResultsGetAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/reservation_requests/2631/lab_requests/535/test_results");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("X-Session-Id", xSessionId);
                _headers.put("X-Authentication-Token", xAuthenticationToken);
                _headers.put("user-agent", BaseController.userAgent);


                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //let the caller know of the success
                            callBack.onSuccess(_context, _context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: Add Description
     * @param    xSessionId    Required parameter: Example: 
     * @param    xAuthenticationToken    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getApiV5LabRequests599TestResults12GetAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/lab_requests/599/test_results/12");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("X-Session-Id", xSessionId);
                _headers.put("X-Authentication-Token", xAuthenticationToken);
                _headers.put("user-agent", BaseController.userAgent);


                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //let the caller know of the success
                            callBack.onSuccess(_context, _context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}