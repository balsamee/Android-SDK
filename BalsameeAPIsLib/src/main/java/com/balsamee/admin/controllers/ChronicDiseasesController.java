/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.balsamee.admin.*;
import com.balsamee.admin.models.*;
import com.balsamee.admin.exceptions.*;
import com.balsamee.admin.http.client.HttpClient;
import com.balsamee.admin.http.client.HttpContext;
import com.balsamee.admin.http.request.HttpRequest;
import com.balsamee.admin.http.response.HttpResponse;
import com.balsamee.admin.http.response.HttpStringResponse;
import com.balsamee.admin.http.client.APICallBack;

public class ChronicDiseasesController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static ChronicDiseasesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ChronicDiseasesController class 
     */
    public static ChronicDiseasesController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new ChronicDiseasesController();
                }
            }
        }
        return instance;
    }

    /**
     * TODO: Add Description
     * @param    xSessionId    Required parameter: Example: 
     * @param    xAuthenticationToken    Required parameter: Example: 
     * @param    contentType    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createApiV5ChronicDiseasesPostAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final String contentType,
                final AddnewchronicdiseaseRequest body,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/chronic_diseases");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("X-Session-Id", xSessionId);
                _headers.put("X-Authentication-Token", xAuthenticationToken);
                _headers.put("Content-Type", contentType);
                _headers.put("user-agent", BaseController.userAgent);


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(body);
                    _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
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
     * @param    contentType    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void updateApiV5ChronicDiseases409PutAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final String contentType,
                final UpdatechronicdiseaseRequest body,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/chronic_diseases/409");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("X-Session-Id", xSessionId);
                _headers.put("X-Authentication-Token", xAuthenticationToken);
                _headers.put("Content-Type", contentType);
                _headers.put("user-agent", BaseController.userAgent);


                //prepare and invoke the API call request to fetch the response
                String _bodyJson;
                HttpRequest _request;
                try {
                    _bodyJson = APIHelper.serialize(body);
                    _request = getClientInstance().putBody(_queryUrl, _headers, _bodyJson);
                } catch (JsonProcessingException jsonProcessingException) {
                    //let the caller know of the error
                    callBack.onFailure(null, jsonProcessingException);
                    return;
                }
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
     * get static list of chronic diseases names
     * @param    xSessionId    Required parameter: Example: 
     * @param    xAuthenticationToken    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getApiV5ChronicDiseasesDiseasesListGetAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/chronic_diseases/diseases_list");

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
    public void getApiV5ChronicDiseases399GetAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/chronic_diseases/399");

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
    public void getApiV5ChronicDiseasesGetAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/chronic_diseases");

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
    public void deleteApiV5ChronicDiseases409DeleteAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/chronic_diseases/409");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("X-Session-Id", xSessionId);
                _headers.put("X-Authentication-Token", xAuthenticationToken);
                _headers.put("user-agent", BaseController.userAgent);


                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().delete(_queryUrl, _headers, null);

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