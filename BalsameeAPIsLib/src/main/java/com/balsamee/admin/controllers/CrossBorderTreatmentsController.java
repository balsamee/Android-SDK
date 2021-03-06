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

public class CrossBorderTreatmentsController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static CrossBorderTreatmentsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CrossBorderTreatmentsController class 
     */
    public static CrossBorderTreatmentsController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new CrossBorderTreatmentsController();
                }
            }
        }
        return instance;
    }

    /**
     * TODO: Add Description
     * @param    page    Required parameter: Example: 
     * @param    perPage    Required parameter: Example: 
     * @param    xAuthenticationToken    Required parameter: Example: 
     * @param    xSessionId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getApiV5CrmCrossBorderTreatmentRequestsGetAsync(
                final int page,
                final int perPage,
                final String xAuthenticationToken,
                final String xSessionId,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/crm/cross_border_treatment_requests");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("page", page);
                _queryParameters.put("per_page", perPage);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("X-Authentication-Token", xAuthenticationToken);
                _headers.put("X-Session-Id", xSessionId);
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
     * @param    contentType    Required parameter: Example: 
     * @param    crossBorderTreatmentName    Required parameter: Example: 
     * @param    crossBorderTreatmentTelephoneNumber    Required parameter: Example: 
     * @param    crossBorderTreatmentEmail    Required parameter: Example: 
     * @param    crossBorderTreatmentDiagnosis    Required parameter: Example: 
     * @param    crossBorderTreatmentTreatmentGroupId    Required parameter: Example: 
     * @param    crossBorderTreatmentCountry    Required parameter: Example: 
     * @param    crossBorderTreatmentRequestType    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createApiV5CrossBorderTreatmentRequestsPostAsync(
                final String contentType,
                final String crossBorderTreatmentName,
                final String crossBorderTreatmentTelephoneNumber,
                final String crossBorderTreatmentEmail,
                final String crossBorderTreatmentDiagnosis,
                final String crossBorderTreatmentTreatmentGroupId,
                final String crossBorderTreatmentCountry,
                final String crossBorderTreatmentRequestType,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/cross_border_treatment_requests");

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
                _headers.put("Content-Type", contentType);
                _headers.put("user-agent", BaseController.userAgent);


                //load all fields for the outgoing API request
                Map<String, Object> _parameters = new HashMap<String, Object>();
                _parameters.put("cross_border_treatment[name]", crossBorderTreatmentName);
                _parameters.put("cross_border_treatment[telephone_number]", crossBorderTreatmentTelephoneNumber);
                _parameters.put("cross_border_treatment[email]", crossBorderTreatmentEmail);
                _parameters.put("cross_border_treatment[diagnosis]", crossBorderTreatmentDiagnosis);
                _parameters.put("cross_border_treatment[treatment_group_id]", crossBorderTreatmentTreatmentGroupId);
                _parameters.put("cross_border_treatment[country]", crossBorderTreatmentCountry);
                _parameters.put("cross_border_treatment[request_type]", crossBorderTreatmentRequestType);

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

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
     * -params[:type]  can be set as hospital or clinic
     *       if not set at all the default is clinics only
     * -params[:treatments] comma seperated treatments ids to filter with
     * -params[:speciality_id] 
     * -params[:country_codes] comma country codes ids to filter with
     * -params[:country_code] for old apis to work send 1 country code to filter by
     * cross border treatments should be sorted by price
     * @param    type    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getApiV5CrossBorderTreatmentsGetAsync(
                final String type,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/cross_border_treatments");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("type", type);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
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
     * @param    countryCode    Required parameter: Example: 
     * @param    xSessionId    Required parameter: Example: 
     * @param    xAuthenticationToken    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getStatesGetAsync(
                final String countryCode,
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/states");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("country_code", countryCode);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

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
    public void getApiV5CrossBorderTreatmentsCountriesGetAsync(
                final String xSessionId,
                final String xAuthenticationToken,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/cross_border_treatments/countries");

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
     * @param    lang    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getApiV5TreatmentsGroupsGetAsync(
                final String lang,
                final APICallBack<Object> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.getBaseUri();

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder("/treatments_groups");

                ///process query parameters
                Map<String, Object> _queryParameters = new HashMap<String, Object>();
                _queryParameters.put("lang", lang);
                APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>();
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