# Getting started

TODO: Add Description

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

* Browse to locate the folder containing the source code. Select the location of the BalsameeAPIs gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

## How to Use

The following section explains how to use the BalsameeAPIs library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':BalsameeAPIsLib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':BalsameeAPIsLib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Balsamee-APIs&workspaceName=BalsameeAPIs&projectName=BalsameeAPIsLib&rootNamespace=com.balsamee.admin)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > BalsameeAPIsLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### 

API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java

com.balsamee.admin.Configuration.initialize(appContext);
BalsameeAPIsClient client = new BalsameeAPIsClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [NewsTagsController](#news_tags_controller)
* [StaticPagesController](#static_pages_controller)
* [GeneralController](#general_controller)
* [MiscController](#misc_controller)
* [MiniPmrController](#mini_pmr_controller)
* [ListRadiologyRequestGroupsController](#list_radiology_request_groups_controller)
* [RadiologyRequestImageGroupController](#radiology_request_image_group_controller)
* [PrescriptionsController](#prescriptions_controller)
* [LabRequestGroupsController](#lab_request_groups_controller)
* [PrescriptionGroupsController](#prescription_groups_controller)
* [LabRequestImagesGroupController](#lab_request_images_group_controller)
* [LabResultsController](#lab_results_controller)
* [PrescriptionImagesGroupController](#prescription_images_group_controller)
* [MedicalProfileController](#medical_profile_controller)
* [LifestylesController](#lifestyles_controller)
* [ChronicDiseasesController](#chronic_diseases_controller)
* [AllergiesController](#allergies_controller)
* [IndividualImagesController](#individual_images_controller)
* [SurgeriesController](#surgeries_controller)
* [MeasurementsRevampV5Controller](#measurements_revamp_v5_controller)
* [ReservationRequestsController](#reservation_requests_controller)
* [NewsFeedController](#news_feed_controller)
* [EventsController](#events_controller)
* [NearbyLocationsController](#nearby_locations_controller)
* [AppointmentsController](#appointments_controller)
* [SessionController](#session_controller)
* [LabRequestsController](#lab_requests_controller)
* [DrugsController](#drugs_controller)
* [PlacesController](#places_controller)
* [DoctorsController](#doctors_controller)
* [CrossBorderTreatmentsController](#cross_border_treatments_controller)
* [CommentsController](#comments_controller)
* [PaypalController](#paypal_controller)
* [DicomMREsController](#dicom_mr_es_controller)
* [VideoRequestsController](#video_requests_controller)
* [PrescriptionImagesController](#prescription_images_controller)
* [LikesController](#likes_controller)
* [VideoExtensionController](#video_extension_controller)
* [EditProfileController](#edit_profile_controller)
* [AdvertisementsController](#advertisements_controller)
* [ResetPasswordController](#reset_password_controller)
* [MessagesController](#messages_controller)
* [LabRequestImagesController](#lab_request_images_controller)
* [MeasurementsController](#measurements_controller)
* [ConfirmationController](#confirmation_controller)

## <a name="news_tags_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.NewsTagsController") NewsTagsController

### Get singleton instance

The singleton instance of the ``` NewsTagsController ``` class can be accessed from the API Client.

```java
NewsTagsController newsTags = client.getNewsTags();
```

### <a name="get_api_v5_news_tags_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NewsTagsController.getApiV5NewsTagsGetAsync") getApiV5NewsTagsGetAsync

> TODO: Add Description


```java
void getApiV5NewsTagsGetAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
newsTags.getApiV5NewsTagsGetAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="static_pages_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.StaticPagesController") StaticPagesController

### Get singleton instance

The singleton instance of the ``` StaticPagesController ``` class can be accessed from the API Client.

```java
StaticPagesController staticPages = client.getStaticPages();
```

### <a name="get_api_v5_call_center_number_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.StaticPagesController.getApiV5CallCenterNumberGetAsync") getApiV5CallCenterNumberGetAsync

> TODO: Add Description


```java
void getApiV5CallCenterNumberGetAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
staticPages.getApiV5CallCenterNumberGetAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_terms_and_conditions_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.StaticPagesController.getApiV5TermsAndConditionsGetAsync") getApiV5TermsAndConditionsGetAsync

> Return terms and conditions html page
> 
> Parameters
> 
> # lang - [ar,en]


```java
void getApiV5TermsAndConditionsGetAsync(
        final String lang,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lang |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String lang = "lang";
// Invoking the API call with sample inputs
staticPages.getApiV5TermsAndConditionsGetAsync(lang, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_privacy_policy_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.StaticPagesController.getApiV5PrivacyPolicyGetAsync") getApiV5PrivacyPolicyGetAsync

> Privacy Policy html page
> 
> Parameters
> 
> # lang - [ar,en]


```java
void getApiV5PrivacyPolicyGetAsync(
        final String lang,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lang |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String lang = "lang";
// Invoking the API call with sample inputs
staticPages.getApiV5PrivacyPolicyGetAsync(lang, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="general_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.GeneralController") GeneralController

### Get singleton instance

The singleton instance of the ``` GeneralController ``` class can be accessed from the API Client.

```java
GeneralController general = client.getGeneral();
```

### <a name="get_api_v5_specialities_with_career_levels_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.GeneralController.getApiV5SpecialitiesWithCareerLevelsGetAsync") getApiV5SpecialitiesWithCareerLevelsGetAsync

> Return career levels with specialities


```java
void getApiV5SpecialitiesWithCareerLevelsGetAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
general.getApiV5SpecialitiesWithCareerLevelsGetAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_search_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.GeneralController.getApiV5SearchGetAsync") getApiV5SearchGetAsync

> Search news


```java
void getApiV5SearchGetAsync(
        final String q,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
general.getApiV5SearchGetAsync(q, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_app_version_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.GeneralController.getApiV5AppVersionGetAsync") getApiV5AppVersionGetAsync

> TODO: Add Description


```java
void getApiV5AppVersionGetAsync(
        final DateTime appVersion,
        final String xAppId,
        final String userAgent,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| appVersion |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |
| userAgent |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
DateTime appVersion = new Date();
String xAppId = "X-App-Id";
String userAgent = "User-Agent";
// Invoking the API call with sample inputs
general.getApiV5AppVersionGetAsync(appVersion, xAppId, userAgent, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_doctor_requests_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.GeneralController.createApiV5DoctorRequestsPostAsync") createApiV5DoctorRequestsPostAsync

> TODO: Add Description


```java
void createApiV5DoctorRequestsPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String careerLevelId,
        final String specialityId,
        final String mobileNumber,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| careerLevelId |  ``` Required ```  | TODO: Add a parameter description |
| specialityId |  ``` Required ```  | TODO: Add a parameter description |
| mobileNumber |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String careerLevelId = "career_level_id";
String specialityId = "speciality_id";
String mobileNumber = "mobile_number";
// Invoking the API call with sample inputs
general.createApiV5DoctorRequestsPostAsync(xAuthenticationToken, xSessionId, careerLevelId, specialityId, mobileNumber, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="misc_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.MiscController") MiscController

### Get singleton instance

The singleton instance of the ``` MiscController ``` class can be accessed from the API Client.

```java
MiscController misc = client.getMisc();
```

### <a name="create_api_v5_doctor_availability_notifications_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MiscController.createApiV5DoctorAvailabilityNotificationsPostAsync") createApiV5DoctorAvailabilityNotificationsPostAsync

> TODO: Add Description


```java
void createApiV5DoctorAvailabilityNotificationsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String doctorAvailabilityNotificationSpecialityId,
        final String doctorAvailabilityNotificationRequestType,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| doctorAvailabilityNotificationSpecialityId |  ``` Required ```  | TODO: Add a parameter description |
| doctorAvailabilityNotificationRequestType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String doctorAvailabilityNotificationSpecialityId = "doctor_availability_notification[speciality_id]";
String doctorAvailabilityNotificationRequestType = "doctor_availability_notification[request_type]";
// Invoking the API call with sample inputs
misc.createApiV5DoctorAvailabilityNotificationsPostAsync(xSessionId, xAuthenticationToken, doctorAvailabilityNotificationSpecialityId, doctorAvailabilityNotificationRequestType, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_contact_request_contact_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MiscController.createApiV5ContactRequestContactPostAsync") createApiV5ContactRequestContactPostAsync

> TODO: Add Description


```java
void createApiV5ContactRequestContactPostAsync(
        final String contentType,
        final String mailName,
        final String mailEmail,
        final String mailFormType,
        final String mailMessage,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| mailName |  ``` Required ```  | TODO: Add a parameter description |
| mailEmail |  ``` Required ```  | TODO: Add a parameter description |
| mailFormType |  ``` Required ```  | TODO: Add a parameter description |
| mailMessage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String contentType = "Content-Type";
String mailName = "mail[name]";
String mailEmail = "mail[email]";
String mailFormType = "mail[form_type]";
String mailMessage = "mail[message]";
// Invoking the API call with sample inputs
misc.createApiV5ContactRequestContactPostAsync(contentType, mailName, mailEmail, mailFormType, mailMessage, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests3263_mres_visit_medical_data_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MiscController.getApiV5ReservationRequests3263MresVisitMedicalDataGetAsync") getApiV5ReservationRequests3263MresVisitMedicalDataGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests3263MresVisitMedicalDataGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
misc.getApiV5ReservationRequests3263MresVisitMedicalDataGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="mini_pmr_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.MiniPmrController") MiniPmrController

### Get singleton instance

The singleton instance of the ``` MiniPmrController ``` class can be accessed from the API Client.

```java
MiniPmrController miniPmr = client.getMiniPmr();
```

### <a name="get_api_v5_individuals_medical_profile_statistics_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MiniPmrController.getApiV5IndividualsMedicalProfileStatisticsGetAsync") getApiV5IndividualsMedicalProfileStatisticsGetAsync

> TODO: Add Description


```java
void getApiV5IndividualsMedicalProfileStatisticsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
miniPmr.getApiV5IndividualsMedicalProfileStatisticsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_radiology_scans_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MiniPmrController.getApiV5RadiologyScansGetAsync") getApiV5RadiologyScansGetAsync

> TODO: Add Description


```java
void getApiV5RadiologyScansGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<ListRadiologyScans> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
miniPmr.getApiV5RadiologyScansGetAsync(xSessionId, xAuthenticationToken, new APICallBack<ListRadiologyScans>() {
    public void onSuccess(HttpContext context, ListRadiologyScans response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="list_radiology_request_groups_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.ListRadiologyRequestGroupsController") ListRadiologyRequestGroupsController

### Get singleton instance

The singleton instance of the ``` ListRadiologyRequestGroupsController ``` class can be accessed from the API Client.

```java
ListRadiologyRequestGroupsController listRadiologyRequestGroups = client.getListRadiologyRequestGroups();
```

### <a name="get_api_v5_radiology_request_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ListRadiologyRequestGroupsController.getApiV5RadiologyRequestGroupsGetAsync") getApiV5RadiologyRequestGroupsGetAsync

> TODO: Add Description


```java
void getApiV5RadiologyRequestGroupsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Listradiologyrequestgroupfile> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
listRadiologyRequestGroups.getApiV5RadiologyRequestGroupsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<Listradiologyrequestgroupfile>() {
    public void onSuccess(HttpContext context, Listradiologyrequestgroupfile response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="radiology_request_image_group_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.RadiologyRequestImageGroupController") RadiologyRequestImageGroupController

### Get singleton instance

The singleton instance of the ``` RadiologyRequestImageGroupController ``` class can be accessed from the API Client.

```java
RadiologyRequestImageGroupController radiologyRequestImageGroup = client.getRadiologyRequestImageGroup();
```

### <a name="create_api_v5_reservation_requests4323_radiology_request_image_groups_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.RadiologyRequestImageGroupController.createApiV5ReservationRequests4323RadiologyRequestImageGroupsPostAsync") createApiV5ReservationRequests4323RadiologyRequestImageGroupsPostAsync

> TODO: Add Description


```java
void createApiV5ReservationRequests4323RadiologyRequestImageGroupsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String radiologyRequestImageGroupRadiologyRequestImagesAttributesImage,
        final APICallBack<Uploadradiologyrequestimagegroupfileforreservationrequestcopy> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| radiologyRequestImageGroupRadiologyRequestImagesAttributesImage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String radiologyRequestImageGroupRadiologyRequestImagesAttributesImage = "radiology_request_image_group[radiology_request_images_attributes][][image]";
// Invoking the API call with sample inputs
radiologyRequestImageGroup.createApiV5ReservationRequests4323RadiologyRequestImageGroupsPostAsync(xSessionId, xAuthenticationToken, radiologyRequestImageGroupRadiologyRequestImagesAttributesImage, new APICallBack<Uploadradiologyrequestimagegroupfileforreservationrequestcopy>() {
    public void onSuccess(HttpContext context, Uploadradiologyrequestimagegroupfileforreservationrequestcopy response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests4323_radiology_request_image_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.RadiologyRequestImageGroupController.getApiV5ReservationRequests4323RadiologyRequestImageGroupsGetAsync") getApiV5ReservationRequests4323RadiologyRequestImageGroupsGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests4323RadiologyRequestImageGroupsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Listradiologyrequestimagegroupfileforreservationrequest> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
radiologyRequestImageGroup.getApiV5ReservationRequests4323RadiologyRequestImageGroupsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<Listradiologyrequestimagegroupfileforreservationrequest>() {
    public void onSuccess(HttpContext context, Listradiologyrequestimagegroupfileforreservationrequest response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_radiology_request_image_groups_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.RadiologyRequestImageGroupController.createApiV5RadiologyRequestImageGroupsPostAsync") createApiV5RadiologyRequestImageGroupsPostAsync

> TODO: Add Description


```java
void createApiV5RadiologyRequestImageGroupsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String radiologyRequestImageGroupRadiologyRequestImagesAttributesImage,
        final APICallBack<Uploadradiologyrequestimagegroupfile> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| radiologyRequestImageGroupRadiologyRequestImagesAttributesImage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String radiologyRequestImageGroupRadiologyRequestImagesAttributesImage = "radiology_request_image_group[radiology_request_images_attributes][][image]";
// Invoking the API call with sample inputs
radiologyRequestImageGroup.createApiV5RadiologyRequestImageGroupsPostAsync(xSessionId, xAuthenticationToken, radiologyRequestImageGroupRadiologyRequestImagesAttributesImage, new APICallBack<Uploadradiologyrequestimagegroupfile>() {
    public void onSuccess(HttpContext context, Uploadradiologyrequestimagegroupfile response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_radiology_request_image_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.RadiologyRequestImageGroupController.getApiV5RadiologyRequestImageGroupsGetAsync") getApiV5RadiologyRequestImageGroupsGetAsync

> TODO: Add Description


```java
void getApiV5RadiologyRequestImageGroupsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Listradiologyrequestimagegroupfile> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
radiologyRequestImageGroup.getApiV5RadiologyRequestImageGroupsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<Listradiologyrequestimagegroupfile>() {
    public void onSuccess(HttpContext context, Listradiologyrequestimagegroupfile response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="prescriptions_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.PrescriptionsController") PrescriptionsController

### Get singleton instance

The singleton instance of the ``` PrescriptionsController ``` class can be accessed from the API Client.

```java
PrescriptionsController prescriptions = client.getPrescriptions();
```

### <a name="create_api_v5_prescriptions_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionsController.createApiV5PrescriptionsPostAsync") createApiV5PrescriptionsPostAsync

> TODO: Add Description


```java
void createApiV5PrescriptionsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String prescriptionDate,
        final String prescriptionPrescriber,
        final String prescriptionPresDrugsAttributes0StartDate,
        final String prescriptionPresDrugsAttributes0Num,
        final String prescriptionPresDrugsAttributes0Duration,
        final String prescriptionPresDrugsAttributes0DrugId,
        final String prescriptionPresDrugsAttributes0Dose,
        final String prescriptionPresDrugsAttributes0Notes,
        final String prescriptionPresDrugsAttributes1461845708794StartDate,
        final String prescriptionPresDrugsAttributes1461845708794Num,
        final String prescriptionPresDrugsAttributes1461845708794Duration,
        final String prescriptionPresDrugsAttributes1461845708794DrugId,
        final String prescriptionPresDrugsAttributes1461845708794Dose,
        final String prescriptionPresDrugsAttributes1461845708794Destroy,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionDate |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPrescriber |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes0StartDate |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes0Num |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes0Duration |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes0DrugId |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes0Dose |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes0Notes |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes1461845708794StartDate |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes1461845708794Num |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes1461845708794Duration |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes1461845708794DrugId |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes1461845708794Dose |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionPresDrugsAttributes1461845708794Destroy |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String prescriptionDate = "prescription[date]";
String prescriptionPrescriber = "prescription[prescriber]";
String prescriptionPresDrugsAttributes0StartDate = "prescription[pres_drugs_attributes][0][start_date]";
String prescriptionPresDrugsAttributes0Num = "prescription[pres_drugs_attributes][0][num]";
String prescriptionPresDrugsAttributes0Duration = "prescription[pres_drugs_attributes][0][duration]";
String prescriptionPresDrugsAttributes0DrugId = "prescription[pres_drugs_attributes][0][drug_id]";
String prescriptionPresDrugsAttributes0Dose = "prescription[pres_drugs_attributes][0][dose]";
String prescriptionPresDrugsAttributes0Notes = "prescription[pres_drugs_attributes][0][notes]";
String prescriptionPresDrugsAttributes1461845708794StartDate = "prescription[pres_drugs_attributes][1461845708794][start_date]";
String prescriptionPresDrugsAttributes1461845708794Num = "prescription[pres_drugs_attributes][1461845708794][num]";
String prescriptionPresDrugsAttributes1461845708794Duration = "prescription[pres_drugs_attributes][1461845708794][duration]";
String prescriptionPresDrugsAttributes1461845708794DrugId = "prescription[pres_drugs_attributes][1461845708794][drug_id]";
String prescriptionPresDrugsAttributes1461845708794Dose = "prescription[pres_drugs_attributes][1461845708794][dose]";
String prescriptionPresDrugsAttributes1461845708794Destroy = "prescription[pres_drugs_attributes][1461845708794][_destroy]";
// Invoking the API call with sample inputs
prescriptions.createApiV5PrescriptionsPostAsync(xSessionId, xAuthenticationToken, prescriptionDate, prescriptionPrescriber, prescriptionPresDrugsAttributes0StartDate, prescriptionPresDrugsAttributes0Num, prescriptionPresDrugsAttributes0Duration, prescriptionPresDrugsAttributes0DrugId, prescriptionPresDrugsAttributes0Dose, prescriptionPresDrugsAttributes0Notes, prescriptionPresDrugsAttributes1461845708794StartDate, prescriptionPresDrugsAttributes1461845708794Num, prescriptionPresDrugsAttributes1461845708794Duration, prescriptionPresDrugsAttributes1461845708794DrugId, prescriptionPresDrugsAttributes1461845708794Dose, prescriptionPresDrugsAttributes1461845708794Destroy, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests4271_prescriptions_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionsController.getApiV5ReservationRequests4271PrescriptionsGetAsync") getApiV5ReservationRequests4271PrescriptionsGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests4271PrescriptionsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptions.getApiV5ReservationRequests4271PrescriptionsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_prescriptions5a1bf82474617232620b0000_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionsController.getApiV5Prescriptions5a1bf82474617232620b0000GetAsync") getApiV5Prescriptions5a1bf82474617232620b0000GetAsync

> TODO: Add Description


```java
void getApiV5Prescriptions5a1bf82474617232620b0000GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptions.getApiV5Prescriptions5a1bf82474617232620b0000GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests46464634_prescriptions5a1bf82474617232620b0000_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionsController.getApiV5ReservationRequests46464634Prescriptions5a1bf82474617232620b0000GetAsync") getApiV5ReservationRequests46464634Prescriptions5a1bf82474617232620b0000GetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests46464634Prescriptions5a1bf82474617232620b0000GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptions.getApiV5ReservationRequests46464634Prescriptions5a1bf82474617232620b0000GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_prescriptions_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionsController.getApiV5PrescriptionsGetAsync") getApiV5PrescriptionsGetAsync

> TODO: Add Description


```java
void getApiV5PrescriptionsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptions.getApiV5PrescriptionsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="lab_request_groups_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.LabRequestGroupsController") LabRequestGroupsController

### Get singleton instance

The singleton instance of the ``` LabRequestGroupsController ``` class can be accessed from the API Client.

```java
LabRequestGroupsController labRequestGroups = client.getLabRequestGroups();
```

### <a name="get_api_v5_lab_request_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestGroupsController.getApiV5LabRequestGroupsGetAsync") getApiV5LabRequestGroupsGetAsync

> TODO: Add Description


```java
void getApiV5LabRequestGroupsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequestGroups.getApiV5LabRequestGroupsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests2631_lab_request_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestGroupsController.getApiV5ReservationRequests2631LabRequestGroupsGetAsync") getApiV5ReservationRequests2631LabRequestGroupsGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests2631LabRequestGroupsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<IndexlabrequestsgroupsforreservationrequestClinicvisit> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequestGroups.getApiV5ReservationRequests2631LabRequestGroupsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<IndexlabrequestsgroupsforreservationrequestClinicvisit>() {
    public void onSuccess(HttpContext context, IndexlabrequestsgroupsforreservationrequestClinicvisit response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="prescription_groups_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.PrescriptionGroupsController") PrescriptionGroupsController

### Get singleton instance

The singleton instance of the ``` PrescriptionGroupsController ``` class can be accessed from the API Client.

```java
PrescriptionGroupsController prescriptionGroups = client.getPrescriptionGroups();
```

### <a name="get_api_v5_prescription_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionGroupsController.getApiV5PrescriptionGroupsGetAsync") getApiV5PrescriptionGroupsGetAsync

> TODO: Add Description


```java
void getApiV5PrescriptionGroupsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptionGroups.getApiV5PrescriptionGroupsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests4271_prescription_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionGroupsController.getApiV5ReservationRequests4271PrescriptionGroupsGetAsync") getApiV5ReservationRequests4271PrescriptionGroupsGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests4271PrescriptionGroupsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<ListPrescriptionsgroupsundercertainclinicvisit> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptionGroups.getApiV5ReservationRequests4271PrescriptionGroupsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<ListPrescriptionsgroupsundercertainclinicvisit>() {
    public void onSuccess(HttpContext context, ListPrescriptionsgroupsundercertainclinicvisit response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="lab_request_images_group_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.LabRequestImagesGroupController") LabRequestImagesGroupController

### Get singleton instance

The singleton instance of the ``` LabRequestImagesGroupController ``` class can be accessed from the API Client.

```java
LabRequestImagesGroupController labRequestImagesGroup = client.getLabRequestImagesGroup();
```

### <a name="create_api_v5_lab_request_images_groups_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestImagesGroupController.createApiV5LabRequestImagesGroupsPostAsync") createApiV5LabRequestImagesGroupsPostAsync

> TODO: Add Description


```java
void createApiV5LabRequestImagesGroupsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String labRequestImagesGroupLabRequestImagesAttributesImage,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| labRequestImagesGroupLabRequestImagesAttributesImage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String labRequestImagesGroupLabRequestImagesAttributesImage = "lab_request_images_group[lab_request_images_attributes][][image]";
// Invoking the API call with sample inputs
labRequestImagesGroup.createApiV5LabRequestImagesGroupsPostAsync(xSessionId, xAuthenticationToken, labRequestImagesGroupLabRequestImagesAttributesImage, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="lab_results_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.LabResultsController") LabResultsController

### Get singleton instance

The singleton instance of the ``` LabResultsController ``` class can be accessed from the API Client.

```java
LabResultsController labResults = client.getLabResults();
```

### <a name="get_api_v5_reservation_requests2631_lab_requests535_test_results_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabResultsController.getApiV5ReservationRequests2631LabRequests535TestResultsGetAsync") getApiV5ReservationRequests2631LabRequests535TestResultsGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests2631LabRequests535TestResultsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labResults.getApiV5ReservationRequests2631LabRequests535TestResultsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_lab_requests599_test_results12_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabResultsController.getApiV5LabRequests599TestResults12GetAsync") getApiV5LabRequests599TestResults12GetAsync

> TODO: Add Description


```java
void getApiV5LabRequests599TestResults12GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labResults.getApiV5LabRequests599TestResults12GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="prescription_images_group_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.PrescriptionImagesGroupController") PrescriptionImagesGroupController

### Get singleton instance

The singleton instance of the ``` PrescriptionImagesGroupController ``` class can be accessed from the API Client.

```java
PrescriptionImagesGroupController prescriptionImagesGroup = client.getPrescriptionImagesGroup();
```

### <a name="create_api_v5_reservation_requests2668_prescription_images_groups_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionImagesGroupController.createApiV5ReservationRequests2668PrescriptionImagesGroupsPostAsync") createApiV5ReservationRequests2668PrescriptionImagesGroupsPostAsync

> TODO: Add Description


```java
void createApiV5ReservationRequests2668PrescriptionImagesGroupsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final String prescriptionImagesGroupPrescriptionImagesAttributesImage,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionImagesGroupPrescriptionImagesAttributesImage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
String prescriptionImagesGroupPrescriptionImagesAttributesImage = "prescription_images_group[prescription_images_attributes][][image]";
// Invoking the API call with sample inputs
prescriptionImagesGroup.createApiV5ReservationRequests2668PrescriptionImagesGroupsPostAsync(xSessionId, xAuthenticationToken, xAppId, prescriptionImagesGroupPrescriptionImagesAttributesImage, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="medical_profile_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.MedicalProfileController") MedicalProfileController

### Get singleton instance

The singleton instance of the ``` MedicalProfileController ``` class can be accessed from the API Client.

```java
MedicalProfileController medicalProfile = client.getMedicalProfile();
```

### <a name="update_api_v5_individuals_update_medical_profile_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MedicalProfileController.updateApiV5IndividualsUpdateMedicalProfilePutAsync") updateApiV5IndividualsUpdateMedicalProfilePutAsync

> TODO: Add Description


```java
void updateApiV5IndividualsUpdateMedicalProfilePutAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String individualBirthDate,
        final String individualGender,
        final String individualBloodGroup,
        final String individualRelationshipStatus,
        final String individualChildrenNumber,
        final String individualNotes,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| individualBirthDate |  ``` Required ```  | TODO: Add a parameter description |
| individualGender |  ``` Required ```  | TODO: Add a parameter description |
| individualBloodGroup |  ``` Required ```  | TODO: Add a parameter description |
| individualRelationshipStatus |  ``` Required ```  | TODO: Add a parameter description |
| individualChildrenNumber |  ``` Required ```  | TODO: Add a parameter description |
| individualNotes |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String individualBirthDate = "individual[birth_date]";
String individualGender = "individual[gender]";
String individualBloodGroup = "individual[blood_group]";
String individualRelationshipStatus = "individual[relationship_status]";
String individualChildrenNumber = "individual[children_number]";
String individualNotes = "individual[notes]";
// Invoking the API call with sample inputs
medicalProfile.updateApiV5IndividualsUpdateMedicalProfilePutAsync(xAuthenticationToken, xSessionId, individualBirthDate, individualGender, individualBloodGroup, individualRelationshipStatus, individualChildrenNumber, individualNotes, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_individuals_medical_profile_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MedicalProfileController.getApiV5IndividualsMedicalProfileGetAsync") getApiV5IndividualsMedicalProfileGetAsync

> TODO: Add Description


```java
void getApiV5IndividualsMedicalProfileGetAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Getmedicalprofile> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
medicalProfile.getApiV5IndividualsMedicalProfileGetAsync(xAuthenticationToken, xSessionId, new APICallBack<Getmedicalprofile>() {
    public void onSuccess(HttpContext context, Getmedicalprofile response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="lifestyles_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.LifestylesController") LifestylesController

### Get singleton instance

The singleton instance of the ``` LifestylesController ``` class can be accessed from the API Client.

```java
LifestylesController lifestyles = client.getLifestyles();
```

### <a name="create_api_v5_life_styles_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LifestylesController.createApiV5LifeStylesPostAsync") createApiV5LifeStylesPostAsync

> TODO: Add Description


```java
void createApiV5LifeStylesPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String lifeStyleKey,
        final String lifeStyleValue,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| lifeStyleKey |  ``` Required ```  | TODO: Add a parameter description |
| lifeStyleValue |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String lifeStyleKey = "life_style[key]";
String lifeStyleValue = "life_style[value]";
// Invoking the API call with sample inputs
lifestyles.createApiV5LifeStylesPostAsync(xSessionId, xAuthenticationToken, lifeStyleKey, lifeStyleValue, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_life_styles1615_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LifestylesController.updateApiV5LifeStyles1615PutAsync") updateApiV5LifeStyles1615PutAsync

> TODO: Add Description


```java
void updateApiV5LifeStyles1615PutAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String lifeStyleKey,
        final String lifeStyleValue,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| lifeStyleKey |  ``` Required ```  | TODO: Add a parameter description |
| lifeStyleValue |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String lifeStyleKey = "life_style[key]";
String lifeStyleValue = "life_style[value]";
// Invoking the API call with sample inputs
lifestyles.updateApiV5LifeStyles1615PutAsync(xSessionId, xAuthenticationToken, lifeStyleKey, lifeStyleValue, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_life_styles_list_life_styles_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LifestylesController.getApiV5LifeStylesListLifeStylesGetAsync") getApiV5LifeStylesListLifeStylesGetAsync

> TODO: Add Description


```java
void getApiV5LifeStylesListLifeStylesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
lifestyles.getApiV5LifeStylesListLifeStylesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_life_styles_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LifestylesController.getApiV5LifeStylesGetAsync") getApiV5LifeStylesGetAsync

> TODO: Add Description


```java
void getApiV5LifeStylesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
lifestyles.getApiV5LifeStylesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_api_v5_life_styles1615_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LifestylesController.deleteApiV5LifeStyles1615DeleteAsync") deleteApiV5LifeStyles1615DeleteAsync

> TODO: Add Description


```java
void deleteApiV5LifeStyles1615DeleteAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
lifestyles.deleteApiV5LifeStyles1615DeleteAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="chronic_diseases_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.ChronicDiseasesController") ChronicDiseasesController

### Get singleton instance

The singleton instance of the ``` ChronicDiseasesController ``` class can be accessed from the API Client.

```java
ChronicDiseasesController chronicDiseases = client.getChronicDiseases();
```

### <a name="create_api_v5_chronic_diseases_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ChronicDiseasesController.createApiV5ChronicDiseasesPostAsync") createApiV5ChronicDiseasesPostAsync

> TODO: Add Description


```java
void createApiV5ChronicDiseasesPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final AddnewchronicdiseaseRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xSessionId = "X-Session-Id";
    String xAuthenticationToken = "X-Authentication-Token";
    String contentType = "Content-Type";
    AddnewchronicdiseaseRequest body = new AddnewchronicdiseaseRequest();
    // Invoking the API call with sample inputs
    chronicDiseases.createApiV5ChronicDiseasesPostAsync(xSessionId, xAuthenticationToken, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_api_v5_chronic_diseases409_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ChronicDiseasesController.updateApiV5ChronicDiseases409PutAsync") updateApiV5ChronicDiseases409PutAsync

> TODO: Add Description


```java
void updateApiV5ChronicDiseases409PutAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final UpdatechronicdiseaseRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xSessionId = "X-Session-Id";
    String xAuthenticationToken = "X-Authentication-Token";
    String contentType = "Content-Type";
    UpdatechronicdiseaseRequest body = new UpdatechronicdiseaseRequest();
    // Invoking the API call with sample inputs
    chronicDiseases.updateApiV5ChronicDiseases409PutAsync(xSessionId, xAuthenticationToken, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_api_v5_chronic_diseases_diseases_list_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ChronicDiseasesController.getApiV5ChronicDiseasesDiseasesListGetAsync") getApiV5ChronicDiseasesDiseasesListGetAsync

> get static list of chronic diseases names


```java
void getApiV5ChronicDiseasesDiseasesListGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
chronicDiseases.getApiV5ChronicDiseasesDiseasesListGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_chronic_diseases399_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ChronicDiseasesController.getApiV5ChronicDiseases399GetAsync") getApiV5ChronicDiseases399GetAsync

> TODO: Add Description


```java
void getApiV5ChronicDiseases399GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
chronicDiseases.getApiV5ChronicDiseases399GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_chronic_diseases_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ChronicDiseasesController.getApiV5ChronicDiseasesGetAsync") getApiV5ChronicDiseasesGetAsync

> TODO: Add Description


```java
void getApiV5ChronicDiseasesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
chronicDiseases.getApiV5ChronicDiseasesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_api_v5_chronic_diseases409_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ChronicDiseasesController.deleteApiV5ChronicDiseases409DeleteAsync") deleteApiV5ChronicDiseases409DeleteAsync

> TODO: Add Description


```java
void deleteApiV5ChronicDiseases409DeleteAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
chronicDiseases.deleteApiV5ChronicDiseases409DeleteAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="allergies_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.AllergiesController") AllergiesController

### Get singleton instance

The singleton instance of the ``` AllergiesController ``` class can be accessed from the API Client.

```java
AllergiesController allergies = client.getAllergies();
```

### <a name="create_api_v5_allergies_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AllergiesController.createApiV5AllergiesPostAsync") createApiV5AllergiesPostAsync

> TODO: Add Description


```java
void createApiV5AllergiesPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final AddnewallergyRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xSessionId = "X-Session-Id";
    String xAuthenticationToken = "X-Authentication-Token";
    String contentType = "Content-Type";
    AddnewallergyRequest body = new AddnewallergyRequest();
    // Invoking the API call with sample inputs
    allergies.createApiV5AllergiesPostAsync(xSessionId, xAuthenticationToken, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_api_v5_allergies260_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AllergiesController.updateApiV5Allergies260PutAsync") updateApiV5Allergies260PutAsync

> TODO: Add Description


```java
void updateApiV5Allergies260PutAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final UpdateallergyRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xSessionId = "X-Session-Id";
    String xAuthenticationToken = "X-Authentication-Token";
    String contentType = "Content-Type";
    UpdateallergyRequest body = new UpdateallergyRequest();
    // Invoking the API call with sample inputs
    allergies.updateApiV5Allergies260PutAsync(xSessionId, xAuthenticationToken, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_api_v5_allergies_autocomplete_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AllergiesController.getApiV5AllergiesAutocompleteGetAsync") getApiV5AllergiesAutocompleteGetAsync

> get static list of chronic diseases names


```java
void getApiV5AllergiesAutocompleteGetAsync(
        final String term,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| term |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String term = "term";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
allergies.getApiV5AllergiesAutocompleteGetAsync(term, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_allergies255_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AllergiesController.getApiV5Allergies255GetAsync") getApiV5Allergies255GetAsync

> TODO: Add Description


```java
void getApiV5Allergies255GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
allergies.getApiV5Allergies255GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_allergies_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AllergiesController.getApiV5AllergiesGetAsync") getApiV5AllergiesGetAsync

> TODO: Add Description


```java
void getApiV5AllergiesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
allergies.getApiV5AllergiesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_api_v5_allergies260_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AllergiesController.deleteApiV5Allergies260DeleteAsync") deleteApiV5Allergies260DeleteAsync

> TODO: Add Description


```java
void deleteApiV5Allergies260DeleteAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
allergies.deleteApiV5Allergies260DeleteAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="individual_images_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.IndividualImagesController") IndividualImagesController

### Get singleton instance

The singleton instance of the ``` IndividualImagesController ``` class can be accessed from the API Client.

```java
IndividualImagesController individualImages = client.getIndividualImages();
```

### <a name="create_api_v5_individual_images_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.IndividualImagesController.createApiV5IndividualImagesPostAsync") createApiV5IndividualImagesPostAsync

> TODO: Add Description


```java
void createApiV5IndividualImagesPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final String individualImageImage,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| individualImageImage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String contentType = "Content-Type";
String individualImageImage = "individual_image[image]";
// Invoking the API call with sample inputs
individualImages.createApiV5IndividualImagesPostAsync(xSessionId, xAuthenticationToken, contentType, individualImageImage, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_individual_images2_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.IndividualImagesController.getApiV5IndividualImages2GetAsync") getApiV5IndividualImages2GetAsync

> TODO: Add Description


```java
void getApiV5IndividualImages2GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
individualImages.getApiV5IndividualImages2GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_individual_images_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.IndividualImagesController.getApiV5IndividualImagesGetAsync") getApiV5IndividualImagesGetAsync

> TODO: Add Description


```java
void getApiV5IndividualImagesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
individualImages.getApiV5IndividualImagesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="surgeries_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.SurgeriesController") SurgeriesController

### Get singleton instance

The singleton instance of the ``` SurgeriesController ``` class can be accessed from the API Client.

```java
SurgeriesController surgeries = client.getSurgeries();
```

### <a name="create_api_v5_surgeries_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SurgeriesController.createApiV5SurgeriesPostAsync") createApiV5SurgeriesPostAsync

> TODO: Add Description


```java
void createApiV5SurgeriesPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final AddnewsurgeryRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xSessionId = "X-Session-Id";
    String xAuthenticationToken = "X-Authentication-Token";
    String contentType = "Content-Type";
    AddnewsurgeryRequest body = new AddnewsurgeryRequest();
    // Invoking the API call with sample inputs
    surgeries.createApiV5SurgeriesPostAsync(xSessionId, xAuthenticationToken, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_api_v5_surgeries300_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SurgeriesController.updateApiV5Surgeries300PutAsync") updateApiV5Surgeries300PutAsync

> TODO: Add Description


```java
void updateApiV5Surgeries300PutAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final UpdatesurgeryRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xSessionId = "X-Session-Id";
    String xAuthenticationToken = "X-Authentication-Token";
    String contentType = "Content-Type";
    UpdatesurgeryRequest body = new UpdatesurgeryRequest();
    // Invoking the API call with sample inputs
    surgeries.updateApiV5Surgeries300PutAsync(xSessionId, xAuthenticationToken, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_api_v5_surgeries304_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SurgeriesController.deleteApiV5Surgeries304DeleteAsync") deleteApiV5Surgeries304DeleteAsync

> TODO: Add Description


```java
void deleteApiV5Surgeries304DeleteAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
surgeries.deleteApiV5Surgeries304DeleteAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_surgeries_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SurgeriesController.getApiV5SurgeriesGetAsync") getApiV5SurgeriesGetAsync

> TODO: Add Description


```java
void getApiV5SurgeriesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
surgeries.getApiV5SurgeriesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_surgeries300_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SurgeriesController.getApiV5Surgeries300GetAsync") getApiV5Surgeries300GetAsync

> TODO: Add Description


```java
void getApiV5Surgeries300GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
surgeries.getApiV5Surgeries300GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="measurements_revamp_v5_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.MeasurementsRevampV5Controller") MeasurementsRevampV5Controller

### Get singleton instance

The singleton instance of the ``` MeasurementsRevampV5Controller ``` class can be accessed from the API Client.

```java
MeasurementsRevampV5Controller measurementsRevampV5 = client.getMeasurementsRevampV5();
```

### <a name="create_api_v5_measurements_weight_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsRevampV5Controller.createApiV5MeasurementsWeightPostAsync") createApiV5MeasurementsWeightPostAsync

> TODO: Add Description


```java
void createApiV5MeasurementsWeightPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String measurementValue,
        final String measurementMeasuredDate,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| measurementValue |  ``` Required ```  | TODO: Add a parameter description |
| measurementMeasuredDate |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String measurementValue = "measurement[value]";
String measurementMeasuredDate = "measurement[measured_date]";
// Invoking the API call with sample inputs
measurementsRevampV5.createApiV5MeasurementsWeightPostAsync(xAuthenticationToken, xSessionId, measurementValue, measurementMeasuredDate, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_measurements_glucose_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsRevampV5Controller.createApiV5MeasurementsGlucosePostAsync") createApiV5MeasurementsGlucosePostAsync

> TODO: Add Description


```java
void createApiV5MeasurementsGlucosePostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String measurementValue,
        final String measurementMeasuredDate,
        final String measurementLastMeal,
        final String measurementLastActivity,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| measurementValue |  ``` Required ```  | TODO: Add a parameter description |
| measurementMeasuredDate |  ``` Required ```  | TODO: Add a parameter description |
| measurementLastMeal |  ``` Required ```  | TODO: Add a parameter description |
| measurementLastActivity |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String measurementValue = "measurement[value]";
String measurementMeasuredDate = "measurement[measured_date]";
String measurementLastMeal = "measurement[last_meal]";
String measurementLastActivity = "measurement[last_activity]";
// Invoking the API call with sample inputs
measurementsRevampV5.createApiV5MeasurementsGlucosePostAsync(xAuthenticationToken, xSessionId, measurementValue, measurementMeasuredDate, measurementLastMeal, measurementLastActivity, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_measurements_blood_pressure_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsRevampV5Controller.createApiV5MeasurementsBloodPressurePostAsync") createApiV5MeasurementsBloodPressurePostAsync

> TODO: Add Description


```java
void createApiV5MeasurementsBloodPressurePostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String measurementMeasuredDate,
        final String measurementSystolic,
        final String measurementDiastolic,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| measurementMeasuredDate |  ``` Required ```  | TODO: Add a parameter description |
| measurementSystolic |  ``` Required ```  | TODO: Add a parameter description |
| measurementDiastolic |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String measurementMeasuredDate = "measurement[measured_date]";
String measurementSystolic = "measurement[systolic]";
String measurementDiastolic = "measurement[diastolic]";
// Invoking the API call with sample inputs
measurementsRevampV5.createApiV5MeasurementsBloodPressurePostAsync(xAuthenticationToken, xSessionId, measurementMeasuredDate, measurementSystolic, measurementDiastolic, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_measurements_weight_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsRevampV5Controller.getApiV5MeasurementsWeightGetAsync") getApiV5MeasurementsWeightGetAsync

> TODO: Add Description


```java
void getApiV5MeasurementsWeightGetAsync(
        final String measurementIntervalStart,
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| measurementIntervalStart |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String measurementIntervalStart = "measurement[interval_start]";
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
measurementsRevampV5.getApiV5MeasurementsWeightGetAsync(measurementIntervalStart, xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_measurements_glucose_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsRevampV5Controller.getApiV5MeasurementsGlucoseGetAsync") getApiV5MeasurementsGlucoseGetAsync

> TODO: Add Description


```java
void getApiV5MeasurementsGlucoseGetAsync(
        final String measurementIntervalStart,
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| measurementIntervalStart |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String measurementIntervalStart = "measurement[interval_start]";
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
measurementsRevampV5.getApiV5MeasurementsGlucoseGetAsync(measurementIntervalStart, xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_measurements_blood_pressure_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsRevampV5Controller.getApiV5MeasurementsBloodPressureGetAsync") getApiV5MeasurementsBloodPressureGetAsync

> TODO: Add Description


```java
void getApiV5MeasurementsBloodPressureGetAsync(
        final String measurementIntervalStart,
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| measurementIntervalStart |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String measurementIntervalStart = "measurement[interval_start]";
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
measurementsRevampV5.getApiV5MeasurementsBloodPressureGetAsync(measurementIntervalStart, xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="reservation_requests_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.ReservationRequestsController") ReservationRequestsController

### Get singleton instance

The singleton instance of the ``` ReservationRequestsController ``` class can be accessed from the API Client.

```java
ReservationRequestsController reservationRequests = client.getReservationRequests();
```

### <a name="create_api_v5_reservation_requests_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.createApiV5ReservationRequestsPostAsync") createApiV5ReservationRequestsPostAsync

>     Create new reservation request
>     
>   URL: /reservation_requests
>   Method: POST
>   @param doctor_id
>   @param address
>   @param address_details
>   @param mobile_number
>   @param country_code
>   @param patient_latitude
>   @param patient_longitude
>   @param country_code] mobile country code
>   @header [String] X-Authentication-Token
>   @header [String] X-Session-Id
>   @return [JsonArray]  errors  ( code: 422 )


```java
void createApiV5ReservationRequestsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String doctorId,
        final String address,
        final String addressDetails,
        final String mobileNumber,
        final String patientLatitude,
        final String patientLongitude,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| doctorId |  ``` Required ```  | TODO: Add a parameter description |
| address |  ``` Required ```  | TODO: Add a parameter description |
| addressDetails |  ``` Required ```  | TODO: Add a parameter description |
| mobileNumber |  ``` Required ```  | TODO: Add a parameter description |
| patientLatitude |  ``` Required ```  | TODO: Add a parameter description |
| patientLongitude |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String doctorId = "doctor_id";
String address = "address";
String addressDetails = "address_details";
String mobileNumber = "mobile_number";
String patientLatitude = "patient_latitude";
String patientLongitude = "patient_longitude";
// Invoking the API call with sample inputs
reservationRequests.createApiV5ReservationRequestsPostAsync(xSessionId, xAuthenticationToken, doctorId, address, addressDetails, mobileNumber, patientLatitude, patientLongitude, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_reservation_requests2685_ratings_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.createApiV5ReservationRequests2685RatingsPostAsync") createApiV5ReservationRequests2685RatingsPostAsync

> TODO: Add Description


```java
void createApiV5ReservationRequests2685RatingsPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String ratingStars,
        final String ratingReview,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| ratingStars |  ``` Required ```  | TODO: Add a parameter description |
| ratingReview |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication_Token";
String xSessionId = "X-Session_Id";
String ratingStars = "rating[stars]";
String ratingReview = "rating[review]";
// Invoking the API call with sample inputs
reservationRequests.createApiV5ReservationRequests2685RatingsPostAsync(xAuthenticationToken, xSessionId, ratingStars, ratingReview, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_reservation_requests4142_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.updateApiV5ReservationRequests4142PutAsync") updateApiV5ReservationRequests4142PutAsync

> Doctor reject resesrvation request


```java
void updateApiV5ReservationRequests4142PutAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String currentStatus,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| currentStatus |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String currentStatus = "current_status";
// Invoking the API call with sample inputs
reservationRequests.updateApiV5ReservationRequests4142PutAsync(xAuthenticationToken, xSessionId, currentStatus, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_reservation_requests_check_validity_code_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.createApiV5ReservationRequestsCheckValidityCodePostAsync") createApiV5ReservationRequestsCheckValidityCodePostAsync

> TODO: Add Description


```java
void createApiV5ReservationRequestsCheckValidityCodePostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String promoCode,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| promoCode |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-session-id";
String xAuthenticationToken = "X-authentication-token";
String promoCode = "promo_code";
// Invoking the API call with sample inputs
reservationRequests.createApiV5ReservationRequestsCheckValidityCodePostAsync(xSessionId, xAuthenticationToken, promoCode, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_reservation_requests2668_add_case_info_patch_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.updateApiV5ReservationRequests2668AddCaseInfoPatchAsync") updateApiV5ReservationRequests2668AddCaseInfoPatchAsync

> TODO: Add Description


```java
void updateApiV5ReservationRequests2668AddCaseInfoPatchAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String caseInfo,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| caseInfo |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String caseInfo = "case_info";
// Invoking the API call with sample inputs
reservationRequests.updateApiV5ReservationRequests2668AddCaseInfoPatchAsync(xAuthenticationToken, xSessionId, caseInfo, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests2678_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.getApiV5ReservationRequests2678GetAsync") getApiV5ReservationRequests2678GetAsync

>     Create new reservation request
>     
>   URL: /reservation_requests
>   Method: POST
>   @param doctor_id
>   @param address
>   @param address_details
>   @param mobile_number
>   @param country_code
>   @param patient_latitude
>   @param patient_longitude
>   @param country_code] mobile country code
>   @header [String] X-Authentication-Token
>   @header [String] X-Session-Id
>   @return [JsonArray]  errors  ( code: 422 )


```java
void getApiV5ReservationRequests2678GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
reservationRequests.getApiV5ReservationRequests2678GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests2686_show_case_info_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.getApiV5ReservationRequests2686ShowCaseInfoGetAsync") getApiV5ReservationRequests2686ShowCaseInfoGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests2686ShowCaseInfoGetAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
reservationRequests.getApiV5ReservationRequests2686ShowCaseInfoGetAsync(xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ReservationRequestsController.getApiV5ReservationRequestsGetAsync") getApiV5ReservationRequestsGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequestsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
reservationRequests.getApiV5ReservationRequestsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="news_feed_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.NewsFeedController") NewsFeedController

### Get singleton instance

The singleton instance of the ``` NewsFeedController ``` class can be accessed from the API Client.

```java
NewsFeedController newsFeed = client.getNewsFeed();
```

### <a name="get_api_v5_news574efc7969702d370a130000_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NewsFeedController.getApiV5News574efc7969702d370a130000GetAsync") getApiV5News574efc7969702d370a130000GetAsync

>   -  NewsFeed (news and ads)
>   
>   - The response is paginated - each page contain 10 records
>   
>   - @params [Integer] page (Page number to fetch)
>   - @params [String] lang [ar|en]
>   - @params [comments_count] (will return the number of comments specified , if not specified it will return all comments)
>   
>   - Response:(JsonArray of news feed)
>   
>     - id (sequence id of news feed)
>     - item_type (News or Advertisement)
>     - if item_type is News then you will find news object
>       - id (news id)
>       - title (news title)
>       - cover (news cover image to display in index page)
>       - content_brief (breif content to display in index page)
>       - body (news content body (html))
>       - likes_count
>       - comments_count
>       - share_count
>       - is_liked (indicate user liked this news or not)
>       - saved_link_id (if user saved this news in saved posts   this key will return id of saved link else will return   null)
>       
>     - if item_type is Advertisement you will find advertisement object
>       - id (advertisement id)
>       - content (advertisement content html)
>       - action_tyoe: ["Internal", "External", "Static"]
>          - Internal: This will open internal model.
>          - External: will open URL
>          - Static: nothing to do
>         
>       - menu_action_key (this will used incase of action_type   is Internal): ["Home Care", "Near by Medical Services", "Measurements"]
>       
>       - external_url (in case of action type is external this key will contain url)
>     
>  
>  
>   - This API called if uer authenticated or not  
>   - in case of authenticated user. send required authentication - headers as below:  
>  
>     - X-Authentication-Token  
>     - X-Session-Id


```java
void getApiV5News574efc7969702d370a130000GetAsync(
        final String lang,
        final int page,
        final int commentsCount,
        final String authenticationToken,
        final String sessionId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lang |  ``` Required ```  | TODO: Add a parameter description |
| page |  ``` Required ```  | TODO: Add a parameter description |
| commentsCount |  ``` Required ```  | TODO: Add a parameter description |
| authenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| sessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String lang = "lang";
int page = 152;
int commentsCount = 152;
String authenticationToken = "authentication_token";
String sessionId = "session_id";
// Invoking the API call with sample inputs
newsFeed.getApiV5News574efc7969702d370a130000GetAsync(lang, page, commentsCount, authenticationToken, sessionId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_news_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NewsFeedController.getApiV5NewsGetAsync") getApiV5NewsGetAsync

>   -  NewsFeed (news and ads)
>   
>   - The response is paginated - each page contain 10 records
>   
>   - @params [Integer] page (Page number to fetch)
>   - @params [String] lang [ar|en]
>   
>   - Response:(JsonArray of news feed)
>   
>     - id (sequence id of news feed)
>     - item_type (News or Advertisement)
>     - if item_type is News then you will find news object
>       - id (news id)
>       - title (news title)
>       - cover (news cover image to display in index page)
>       - content_brief (breif content to display in index page)
>       - body (news content body (html))
>       - likes_count
>       - comments_count
>       - share_count
>       - is_liked (indicate user liked this news or not)
>       - saved_link_id (if user saved this news in saved posts   this key will return id of saved link else will return   null)
>       - special_tag
>             -id
> 			-name
> 			-icon
> 			-color (hexa)
> 			
>       
>     - if item_type is Advertisement you will find advertisement object
>       - id (advertisement id)
>       - content (advertisement content html)
>       - action_tyoe: ["Internal", "External", "Static"]
>          - Internal: This will open internal model.
>          - External: will open URL
>          - Static: nothing to do
>         
>       - menu_action_key (this will used incase of action_type   is Internal): ["Home Care", "Near by Medical Services", "Measurements"]
>       
>       - external_url (in case of action type is external this key will contain url)
>     
>  
>  
>   - This API called if uer authenticated or not  
>   - in case of authenticated user. send required authentication - headers as below:  
>  
>     - X-Authentication-Token  
>     - X-Session-Id


```java
void getApiV5NewsGetAsync(
        final int page,
        final int perPage,
        final String lang,
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Newssuccess> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| perPage |  ``` Required ```  | TODO: Add a parameter description |
| lang |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 152;
int perPage = 152;
String lang = "lang";
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
newsFeed.getApiV5NewsGetAsync(page, perPage, lang, xAuthenticationToken, xSessionId, new APICallBack<Newssuccess>() {
    public void onSuccess(HttpContext context, Newssuccess response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_news_feeds_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NewsFeedController.getApiV5NewsFeedsGetAsync") getApiV5NewsFeedsGetAsync

>   -  NewsFeed (news and ads)
>   
>   - The response is paginated - each page contain 10 records
>   
>   - @params [Integer] page (Page number to fetch)
>   - @params [String] lang [ar|en]
>   
>   - Response:(JsonArray of news feed)
>   
>     - id (sequence id of news feed)
>     - item_type (News or Advertisement)
>     - if item_type is News then you will find news object
>       - id (news id)
>       - title (news title)
>       - cover (news cover image to display in index page)
>       - content_brief (breif content to display in index page)
>       - body (news content body (html))
>       - likes_count
>       - comments_count
>       - share_count
>       - is_liked (indicate user liked this news or not)
>       - saved_link_id (if user saved this news in saved posts   this key will return id of saved link else will return   null)
>       -special_tag 
> 			-id 
> 			-name
> 			-icon
> 			-color (hexa)
>     - if item_type is Advertisement you will find advertisement object
>       - id (advertisement id)
>       - content_body (advertisement content html)
>       - action_type: ["Internal", "External", "Static"]
>          - Internal: This will open internal model.
>          - External: will open URL
>          - Static: nothing to do
>         
>       - menu_action_key (this will used incase of action_type   is Internal): ["Home Care", "Near by Medical Services", "Measurements"]
>       
>       - external_url (in case of action type is external this key will contain url)
>     
>  
>  
>   - This API called if uer authenticated or not  
>   - in case of authenticated user. send required authentication - headers as below:  
>  
>     - X-Authentication-Token  
>     - X-Session-Id


```java
void getApiV5NewsFeedsGetAsync(
        final String lang,
        final int page,
        final String newsTagId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lang |  ``` Required ```  | TODO: Add a parameter description |
| page |  ``` Required ```  | TODO: Add a parameter description |
| newsTagId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String lang = "lang";
int page = 243;
String newsTagId = "news_tag_id";
// Invoking the API call with sample inputs
newsFeed.getApiV5NewsFeedsGetAsync(lang, page, newsTagId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_news580f73426d61725cae000000_increment_share_count_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NewsFeedController.updateApiV5News580f73426d61725cae000000IncrementShareCountPutAsync") updateApiV5News580f73426d61725cae000000IncrementShareCountPutAsync

> -This function increments the share counter (initially returns = 0) whenever the user shares a post. 
> -The return variable name is "share_count"
> -To call the count incrementer call the following url news/news_id/increment_share_count?lang=en


```java
void updateApiV5News580f73426d61725cae000000IncrementShareCountPutAsync(
        final String lang,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lang |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String lang = "lang";
// Invoking the API call with sample inputs
newsFeed.updateApiV5News580f73426d61725cae000000IncrementShareCountPutAsync(lang, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="events_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.EventsController") EventsController

### Get singleton instance

The singleton instance of the ``` EventsController ``` class can be accessed from the API Client.

```java
EventsController events = client.getEvents();
```

### <a name="get_api_v5_events_entities_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.EventsController.getApiV5EventsEntitiesGetAsync") getApiV5EventsEntitiesGetAsync

> Search for entities that have public events within next 30 days
> params
> 	- page => page number
> 	- per_page => number of rows you need per page, default: 10
> 	- type => the entity type ["Enterprise", "Clinic", "InsuranceCompany", "Hospital", "MedicalCenter", "Ngo", "Lab", "Pharmacy"] 
> 		"this is optional, if not specified it searches for all entity types with no restriction", this is in the url not query, events/:type/...
> 	- entity_name => the name of a specific entity


```java
void getApiV5EventsEntitiesGetAsync(
        final int page,
        final String entityName,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| entityName |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 243;
String entityName = "entity_name";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
events.getApiV5EventsEntitiesGetAsync(page, entityName, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_events_search_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.EventsController.getApiV5EventsSearchGetAsync") getApiV5EventsSearchGetAsync

> Search for entities that have public events within next 30 days
> params
>   - page => page number
>   - per_page => number of rows you need per page, default: 10
>   - type => the entity type ["Enterprise", "Clinic", "InsuranceCompany", "Hospital", "MedicalCenter", "Ngo", "Lab", "Pharmacy"] 
>     "this is optional, if not specified it searches for all entity types with no restriction", this is in the url not query, events/:type/...
>   - entity_name => the name of a specific entity


```java
void getApiV5EventsSearchGetAsync(
        final int page,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 243;
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
events.getApiV5EventsSearchGetAsync(page, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_events_doctors_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.EventsController.getApiV5EventsDoctorsGetAsync") getApiV5EventsDoctorsGetAsync

> Search for doctors that have public events within next 30 days
> 	params
> 		- page => page number 
> 		- per_page => number of rows you need per page, default: 10 
> 		- doctor_name
> 		- doctor_spec
> 		- entity_id
> 		- 
> 		all params are optional, filter by any of them


```java
void getApiV5EventsDoctorsGetAsync(
        final int page,
        final int perPage,
        final int entityId,
        final String doctorName,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| perPage |  ``` Required ```  | TODO: Add a parameter description |
| entityId |  ``` Required ```  | TODO: Add a parameter description |
| doctorName |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 243;
int perPage = 243;
int entityId = 243;
String doctorName = "doctor_name";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
events.getApiV5EventsDoctorsGetAsync(page, perPage, entityId, doctorName, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_events_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.EventsController.getApiV5EventsGetAsync") getApiV5EventsGetAsync

> TODO: Add Description


```java
void getApiV5EventsGetAsync(
        final boolean dateGrouped,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dateGrouped |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
boolean dateGrouped = true;
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
events.getApiV5EventsGetAsync(dateGrouped, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="nearby_locations_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.NearbyLocationsController") NearbyLocationsController

### Get singleton instance

The singleton instance of the ``` NearbyLocationsController ``` class can be accessed from the API Client.

```java
NearbyLocationsController nearbyLocations = client.getNearbyLocations();
```

### <a name="get_api_v5_maps_get_type_in_region_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsGetTypeInRegionGetAsync") getApiV5MapsGetTypeInRegionGetAsync

> # Specifications :-
> <b>URL : </b>/maps/get_type_in_region  
> <b>Method : </b>GET  
> <b>Description : </b>Auto-complete over the sent substring  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- type : clinic or hospital ... etc  
> 2- region_id : region code ... you got it with get_regions action in the first call to api  
> 3- country : country code ... you got it with get_regions action in the first call to api  
> 4- langauge : the langauge in which the results will come with  
> # Response/JSON :-
> { <b>data:</b> array of results for query sent }, <b>status: :ok</b>  
> <b>Every Reply in the array consists of:</b>  
> 1- formatted_address  
> 2- name  
> 3- place_id : unique identifier for that place and could be sent to get datails about that result  
> 4- latitude  
> 5- longitude  
> 6- photo_url  


```java
void getApiV5MapsGetTypeInRegionGetAsync(
        final String type,
        final String regionId,
        final String country,
        final String langauge,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Required ```  | TODO: Add a parameter description |
| regionId |  ``` Required ```  | TODO: Add a parameter description |
| country |  ``` Required ```  | TODO: Add a parameter description |
| langauge |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String type = "type";
String regionId = "region_id";
String country = "country";
String langauge = "langauge";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsGetTypeInRegionGetAsync(type, regionId, country, langauge, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_autocomplete_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsAutocompleteGetAsync") getApiV5MapsAutocompleteGetAsync

> # Specifications :-
> <b>URL : </b>/maps/autocomplete  
> <b>Method : </b>GET  
> <b>Description : </b>Auto-complete over the sent substring  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- input : string you want to auto comlete  
> 2- langauge : the langauge in which the results will come with  
> 3- country : autocomplete will search through places in this cuontry  
> # Response/JSON :-
> { <b>data:</b> array of predictions for the string sent }, <b>status: :ok</b>  
> <b>Every prediction in the array consists of :</b>  
> 1- name : string value for prediction  
> 2- place_id :  unique id of a place to send it to details request  
> 3- types : types specified to the place  


```java
void getApiV5MapsAutocompleteGetAsync(
        final String input,
        final String langauge,
        final String country,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| input |  ``` Required ```  | TODO: Add a parameter description |
| langauge |  ``` Required ```  | TODO: Add a parameter description |
| country |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String input = "input";
String langauge = "langauge";
String country = "country";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsAutocompleteGetAsync(input, langauge, country, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_details_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsDetailsGetAsync") getApiV5MapsDetailsGetAsync

> # Specifications :-
> <b>URL : </b>/maps/details  
> <b>Method : </b>GET  
> <b>Description : </b>get details about sme place  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- id : place id you want to get details about  
> 2- source : currently g for google and f for foursquare cuontry  
> 3- app_id
> # Response/JSON :-
> { <b>data:</b> detailed data about specified place }, <b>status: :ok</b>  
> <b>returned data consists of :</b>  
> 1- formatted_address  
> 2- formatted_phone_number  
> 3- international_phone_number  
> 4- photo_url


```java
void getApiV5MapsDetailsGetAsync(
        final String id,
        final String source,
        final String appId,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | TODO: Add a parameter description |
| source |  ``` Required ```  | TODO: Add a parameter description |
| appId |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String id = "id";
String source = "source";
String appId = "app_id";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsDetailsGetAsync(id, source, appId, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_text_search_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsTextSearchGetAsync") getApiV5MapsTextSearchGetAsync

> # Specifications :-
> <b>URL : </b>/maps/text_search  
> <b>Method : </b>GET  
> <b>Description : </b>Auto-complete over the sent substring  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- query : the search text you want to search about  
> 2- langauge : the langauge in which the results will come with  
> # Response/JSON :-
> { <b>data:</b> array of results for query sent }, <b>status: :ok</b>  
> <b>Every Reply in the array consists of:</b>  
> 1- formatted_address  
> 2- name  
> 3- place_id : unique identifier for that place and could be sent to get datails about that result  
> 4- latitude  
> 5- longitude


```java
void getApiV5MapsTextSearchGetAsync(
        final String query,
        final String langauge,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| query |  ``` Required ```  | TODO: Add a parameter description |
| langauge |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String query = "query";
String langauge = "langauge";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsTextSearchGetAsync(query, langauge, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_photo_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsPhotoGetAsync") getApiV5MapsPhotoGetAsync

> # Specifications :-
> <b>URL : </b>/maps/photo  
> <b>Method : </b>GET  
> <b>Description : </b>return photo_url of photo_reference  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- photoreference : unique identifier of photo ... usualy comes in search  
> 2- maxwidth : the width you want of the photo  
> # Response/JSON :-
> { <b>data:</b> photo_url }, <b>status: :ok</b>  


```java
void getApiV5MapsPhotoGetAsync(
        final String photoreference,
        final String maxwidth,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| photoreference |  ``` Required ```  | TODO: Add a parameter description |
| maxwidth |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String photoreference = "photoreference";
String maxwidth = "maxwidth";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsPhotoGetAsync(photoreference, maxwidth, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_get_name_of_country_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsGetNameOfCountryGetAsync") getApiV5MapsGetNameOfCountryGetAsync

> # Specifications :-
> <b>URL : </b>/maps/get_name_of_country  
> <b>Method : </b>GET  
> <b>Description : </b>return name of country  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- latitude  
> 2- longitude  
> # Response/JSON :-
> { <b>data:</b> name of country }, <b>status: :ok</b>  


```java
void getApiV5MapsGetNameOfCountryGetAsync(
        final String latitude,
        final String longitude,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | TODO: Add a parameter description |
| longitude |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String latitude = "latitude";
String longitude = "longitude";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsGetNameOfCountryGetAsync(latitude, longitude, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_get_regions_of_country_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsGetRegionsOfCountryGetAsync") getApiV5MapsGetRegionsOfCountryGetAsync

> # Specifications :-
> <b>URL : </b>/maps/get_regions_of_country  
> <b>Method : </b>GET  
> <b>Description : </b>return regions of country  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- latitude  
> 2- longitude  
> # Response/JSON :-
> { <b>data:</b> {} }, <b>status: :ok</b>  
> data contains hash with iso-code of country and code for each region and its name


```java
void getApiV5MapsGetRegionsOfCountryGetAsync(
        final String latitude,
        final String longitude,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | TODO: Add a parameter description |
| longitude |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String latitude = "latitude";
String longitude = "longitude";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsGetRegionsOfCountryGetAsync(latitude, longitude, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_get_regions_and_places_in_country_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsGetRegionsAndPlacesInCountryGetAsync") getApiV5MapsGetRegionsAndPlacesInCountryGetAsync

> # Specifications :-
> <b>URL : </b>/maps/get_regions_and_places_in_country  
> <b>Method : </b>GET  
> <b>Description : </b>return regions of country text search with type in that country  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- latitude  
> 2- longitude  
> 3- type : clinic or hospital ... etc  
> # Response/JSON :-
> { <b>data:</b> {} }, <b>status: :ok</b>  
> data is the same as get_regions + get_type_in_region


```java
void getApiV5MapsGetRegionsAndPlacesInCountryGetAsync(
        final String latitude,
        final String longitude,
        final String type,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | TODO: Add a parameter description |
| longitude |  ``` Required ```  | TODO: Add a parameter description |
| type |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String latitude = "latitude";
String longitude = "longitude";
String type = "type";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsGetRegionsAndPlacesInCountryGetAsync(latitude, longitude, type, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_foursquare_plces_search_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsFoursquarePlcesSearchGetAsync") getApiV5MapsFoursquarePlcesSearchGetAsync

> # Specifications :-
> <b>URL : </b>/maps/foursquare_plces_search  
> <b>Method : </b>GET  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- latitude  
> 2- longitude  
> 3- type : clinic or hospital ... etc  
> # Response/JSON :-
> { <b>data:</b> array of results for query sent }, <b>status: :ok</b>  
> <b>Every Reply in the array consists of:</b>  
> 1- formatted_address  
> 2- name  
> 3- place_id : unique identifier for that place and could be sent to get datails about that result  
> 4- latitude  
> 5- longitude  
> 6- photo_url  


```java
void getApiV5MapsFoursquarePlcesSearchGetAsync(
        final String latitude,
        final String longitude,
        final String type,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | TODO: Add a parameter description |
| longitude |  ``` Required ```  | TODO: Add a parameter description |
| type |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String latitude = "latitude";
String longitude = "longitude";
String type = "type";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsFoursquarePlcesSearchGetAsync(latitude, longitude, type, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_maps_get_foursquare_photo_url_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.NearbyLocationsController.getApiV5MapsGetFoursquarePhotoUrlGetAsync") getApiV5MapsGetFoursquarePhotoUrlGetAsync

> # Specifications :-
> <b>URL : </b>/maps/get_foursquare_photo_url  
> <b>Method : </b>GET  
> <b>Description : </b>return photo_url of photo_reference  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- place_id : place id you want to get details about  
> # Response/JSON :-
> { <b>data:</b> photo_url }, <b>status: :ok</b>  


```java
void getApiV5MapsGetFoursquarePhotoUrlGetAsync(
        final String placeId,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| placeId |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String placeId = "place_id";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
nearbyLocations.getApiV5MapsGetFoursquarePhotoUrlGetAsync(placeId, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="appointments_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.AppointmentsController") AppointmentsController

### Get singleton instance

The singleton instance of the ``` AppointmentsController ``` class can be accessed from the API Client.

```java
AppointmentsController appointments = client.getAppointments();
```

### <a name="create_api_v5_appointment_requests_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AppointmentsController.createApiV5AppointmentRequestsPostAsync") createApiV5AppointmentRequestsPostAsync

> TODO: Add Description


```java
void createApiV5AppointmentRequestsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String contentType,
        final CreateRequest1 body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xSessionId = "X-Session-Id";
    String xAuthenticationToken = "X-Authentication-Token";
    String contentType = "Content-Type";
    CreateRequest1 body = new CreateRequest1();
    // Invoking the API call with sample inputs
    appointments.createApiV5AppointmentRequestsPostAsync(xSessionId, xAuthenticationToken, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_api_v5_appointment_requests_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AppointmentsController.getApiV5AppointmentRequestsGetAsync") getApiV5AppointmentRequestsGetAsync

> TODO: Add Description


```java
void getApiV5AppointmentRequestsGetAsync(
        final int page,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 243;
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
appointments.getApiV5AppointmentRequestsGetAsync(page, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="session_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.SessionController") SessionController

### Get singleton instance

The singleton instance of the ``` SessionController ``` class can be accessed from the API Client.

```java
SessionController session = client.getSession();
```

### <a name="create_api_v5_registrations_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SessionController.createApiV5RegistrationsPostAsync") createApiV5RegistrationsPostAsync

> sign up by email or mobule number 


```java
void createApiV5RegistrationsPostAsync(
        final String individualIdentifier,
        final String individualFirstName,
        final String individualLastName,
        final String individualPassword,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| individualIdentifier |  ``` Required ```  | TODO: Add a parameter description |
| individualFirstName |  ``` Required ```  | TODO: Add a parameter description |
| individualLastName |  ``` Required ```  | TODO: Add a parameter description |
| individualPassword |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String individualIdentifier = "individual[identifier]";
String individualFirstName = "individual[first_name]";
String individualLastName = "individual[last_name]";
String individualPassword = "individual[password]";
// Invoking the API call with sample inputs
session.createApiV5RegistrationsPostAsync(individualIdentifier, individualFirstName, individualLastName, individualPassword, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_sessions_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SessionController.createApiV5SessionsPostAsync") createApiV5SessionsPostAsync

> login by email or mobile number 


```java
void createApiV5SessionsPostAsync(
        final String xAppId,
        final String sessionIdentifier,
        final String sessionPassword,
        final APICallBack<Success> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAppId |  ``` Required ```  | TODO: Add a parameter description |
| sessionIdentifier |  ``` Required ```  | nada.magdy+100@nabdacare.com |
| sessionPassword |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAppId = "X-App-Id";
String sessionIdentifier = "session[identifier]";
String sessionPassword = "session[password]";
// Invoking the API call with sample inputs
session.createApiV5SessionsPostAsync(xAppId, sessionIdentifier, sessionPassword, new APICallBack<Success>() {
    public void onSuccess(HttpContext context, Success response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized |



### <a name="create_api_v5_sessions_facebook_login_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SessionController.createApiV5SessionsFacebookLoginPostAsync") createApiV5SessionsFacebookLoginPostAsync

> TODO: Add Description


```java
void createApiV5SessionsFacebookLoginPostAsync(
        final String xFacebookToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xFacebookToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xFacebookToken = "X-Facebook-Token";
// Invoking the API call with sample inputs
session.createApiV5SessionsFacebookLoginPostAsync(xFacebookToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_sessions_get_user_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SessionController.getApiV5SessionsGetUserGetAsync") getApiV5SessionsGetUserGetAsync

> Get individual with more details 
> 1 - reservation_request


```java
void getApiV5SessionsGetUserGetAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
session.getApiV5SessionsGetUserGetAsync(xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_sessions_individual_details_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.SessionController.getApiV5SessionsIndividualDetailsGetAsync") getApiV5SessionsIndividualDetailsGetAsync

> Get individual with more details 
> 1 - reservation_request


```java
void getApiV5SessionsIndividualDetailsGetAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
session.getApiV5SessionsIndividualDetailsGetAsync(xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="lab_requests_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.LabRequestsController") LabRequestsController

### Get singleton instance

The singleton instance of the ``` LabRequestsController ``` class can be accessed from the API Client.

```java
LabRequestsController labRequests = client.getLabRequests();
```

### <a name="get_api_v5_lab_requests_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestsController.getApiV5LabRequestsGetAsync") getApiV5LabRequestsGetAsync

> TODO: Add Description


```java
void getApiV5LabRequestsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequests.getApiV5LabRequestsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_lab_requests515_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestsController.getApiV5LabRequests515GetAsync") getApiV5LabRequests515GetAsync

> TODO: Add Description


```java
void getApiV5LabRequests515GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequests.getApiV5LabRequests515GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests2631_lab_requests_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestsController.getApiV5ReservationRequests2631LabRequestsGetAsync") getApiV5ReservationRequests2631LabRequestsGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests2631LabRequestsGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequests.getApiV5ReservationRequests2631LabRequestsGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests2631_lab_requests535_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestsController.getApiV5ReservationRequests2631LabRequests535GetAsync") getApiV5ReservationRequests2631LabRequests535GetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests2631LabRequests535GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequests.getApiV5ReservationRequests2631LabRequests535GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="drugs_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.DrugsController") DrugsController

### Get singleton instance

The singleton instance of the ``` DrugsController ``` class can be accessed from the API Client.

```java
DrugsController drugs = client.getDrugs();
```

### <a name="get_api_v5_drugs_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.DrugsController.getApiV5DrugsGetAsync") getApiV5DrugsGetAsync

> TODO: Add Description


```java
void getApiV5DrugsGetAsync(
        final int active,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| active |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int active = 243;
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
drugs.getApiV5DrugsGetAsync(active, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="places_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.PlacesController") PlacesController

### Get singleton instance

The singleton instance of the ``` PlacesController ``` class can be accessed from the API Client.

```java
PlacesController places = client.getPlaces();
```

### <a name="get_api_v5_places_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PlacesController.getApiV5PlacesGetAsync") getApiV5PlacesGetAsync

> # URL         => /places
>   # Method      => GET
>   # Description => return regions of country text search with type in that country
>   #==Parameters
>   # headers['X-Authentication-Token']
>   # headers['X-Session-Id']
>   # headers['X-App-Id']
>   # params[:latitude]
>   # params[:longitude]
>   # params[:type] : clinic or hospital ... etc
>   #==Response/JSON
>   # { data: {} }, status: :ok


```java
void getApiV5PlacesGetAsync(
        final double latitude,
        final double longitude,
        final String type,
        final String lang,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | TODO: Add a parameter description |
| longitude |  ``` Required ```  | TODO: Add a parameter description |
| type |  ``` Required ```  | TODO: Add a parameter description |
| lang |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
double latitude = 243.560235404205;
double longitude = 243.560235404205;
String type = "type";
String lang = "lang";
// Invoking the API call with sample inputs
places.getApiV5PlacesGetAsync(latitude, longitude, type, lang, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_places_categories_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PlacesController.getApiV5PlacesCategoriesGetAsync") getApiV5PlacesCategoriesGetAsync

>   # URL         => /places/categories
>   # Method      => GET
>   # Description => return categories
>   #==Parameters
>   # headers['X-Authentication-Token']
>   # headers['X-Session-Id']
>   # headers['X-App-Id']
>   #==Response/JSON
>   # { categories: {} }, status: :ok


```java
void getApiV5PlacesCategoriesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
places.getApiV5PlacesCategoriesGetAsync(xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_places_ch_ijc7w_xvk_ewwbq_ra_u_li_e84_dfe_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PlacesController.getApiV5PlacesChIJC7wXvkEWWBQRaULiE84DFEGetAsync") getApiV5PlacesChIJC7wXvkEWWBQRaULiE84DFEGetAsync

> # URL         => /places/id
>   # Method      => GET
>   # Description => get details about some place      
>   #==Parameters
>   # headers['X-Authentication-Token']
>   # headers['X-Session-Id']
>   # headers['X-App-Id']
>   # params[:id] : place id you want to get details about  
>   # params[:source] : currently g for google and f for foursquare
>   # you should add app_id
>   #==Response/JSON
>   # { data: detailed data about specified place }, status: :ok
>   # returned data consists of
>   # formatted_address  
>   # formatted_phone_number
>   # international_phone_number
>   # photo_url : photo_url


```java
void getApiV5PlacesChIJC7wXvkEWWBQRaULiE84DFEGetAsync(
        final String source,
        final String lang,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| source |  ``` Required ```  | TODO: Add a parameter description |
| lang |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String source = "source";
String lang = "lang";
// Invoking the API call with sample inputs
places.getApiV5PlacesChIJC7wXvkEWWBQRaULiE84DFEGetAsync(source, lang, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="doctors_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.DoctorsController") DoctorsController

### Get singleton instance

The singleton instance of the ``` DoctorsController ``` class can be accessed from the API Client.

```java
DoctorsController doctors = client.getDoctors();
```

### <a name="get_api_v5_doctors_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.DoctorsController.getApiV5DoctorsGetAsync") getApiV5DoctorsGetAsync

>   Get Doctors
> 
>   This API by default did'nt include accepted doctor in the response  
> 
>     
>   @params [Float] latitude  
>   @params [Float] longitude  
>   @param  [Integer] speciality_id  
>   @param  [Integer] career_level_id  
>   @return [JsonArray] doctors
>  
>   This API called if uer authenticated or not  
>   in case of authenticated user. send required authentication headers as below:  
>  
>  X-Authentication-Token  
>  X-Session-Id  
>  


```java
void getApiV5DoctorsGetAsync(
        final double latitude,
        final double longitude,
        final String specialityId,
        final String careerLevelId,
        final int limit,
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | TODO: Add a parameter description |
| longitude |  ``` Required ```  | TODO: Add a parameter description |
| specialityId |  ``` Required ```  | TODO: Add a parameter description |
| careerLevelId |  ``` Required ```  | TODO: Add a parameter description |
| limit |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
double latitude = 243.560235404205;
double longitude = 243.560235404205;
String specialityId = "speciality_id";
String careerLevelId = "career_level_id";
int limit = 243;
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
doctors.getApiV5DoctorsGetAsync(latitude, longitude, specialityId, careerLevelId, limit, xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="cross_border_treatments_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.CrossBorderTreatmentsController") CrossBorderTreatmentsController

### Get singleton instance

The singleton instance of the ``` CrossBorderTreatmentsController ``` class can be accessed from the API Client.

```java
CrossBorderTreatmentsController crossBorderTreatments = client.getCrossBorderTreatments();
```

### <a name="get_api_v5_crm_cross_border_treatment_requests_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CrossBorderTreatmentsController.getApiV5CrmCrossBorderTreatmentRequestsGetAsync") getApiV5CrmCrossBorderTreatmentRequestsGetAsync

> TODO: Add Description


```java
void getApiV5CrmCrossBorderTreatmentRequestsGetAsync(
        final int page,
        final int perPage,
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| perPage |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 243;
int perPage = 243;
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
crossBorderTreatments.getApiV5CrmCrossBorderTreatmentRequestsGetAsync(page, perPage, xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_cross_border_treatment_requests_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CrossBorderTreatmentsController.createApiV5CrossBorderTreatmentRequestsPostAsync") createApiV5CrossBorderTreatmentRequestsPostAsync

> TODO: Add Description


```java
void createApiV5CrossBorderTreatmentRequestsPostAsync(
        final String contentType,
        final String crossBorderTreatmentName,
        final String crossBorderTreatmentTelephoneNumber,
        final String crossBorderTreatmentEmail,
        final String crossBorderTreatmentDiagnosis,
        final String crossBorderTreatmentTreatmentGroupId,
        final String crossBorderTreatmentCountry,
        final String crossBorderTreatmentRequestType,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| crossBorderTreatmentName |  ``` Required ```  | TODO: Add a parameter description |
| crossBorderTreatmentTelephoneNumber |  ``` Required ```  | TODO: Add a parameter description |
| crossBorderTreatmentEmail |  ``` Required ```  | TODO: Add a parameter description |
| crossBorderTreatmentDiagnosis |  ``` Required ```  | TODO: Add a parameter description |
| crossBorderTreatmentTreatmentGroupId |  ``` Required ```  | TODO: Add a parameter description |
| crossBorderTreatmentCountry |  ``` Required ```  | TODO: Add a parameter description |
| crossBorderTreatmentRequestType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String contentType = "Content-Type";
String crossBorderTreatmentName = "cross_border_treatment[name]";
String crossBorderTreatmentTelephoneNumber = "cross_border_treatment[telephone_number]";
String crossBorderTreatmentEmail = "cross_border_treatment[email]";
String crossBorderTreatmentDiagnosis = "cross_border_treatment[diagnosis]";
String crossBorderTreatmentTreatmentGroupId = "cross_border_treatment[treatment_group_id]";
String crossBorderTreatmentCountry = "cross_border_treatment[country]";
String crossBorderTreatmentRequestType = "cross_border_treatment[request_type]";
// Invoking the API call with sample inputs
crossBorderTreatments.createApiV5CrossBorderTreatmentRequestsPostAsync(contentType, crossBorderTreatmentName, crossBorderTreatmentTelephoneNumber, crossBorderTreatmentEmail, crossBorderTreatmentDiagnosis, crossBorderTreatmentTreatmentGroupId, crossBorderTreatmentCountry, crossBorderTreatmentRequestType, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_cross_border_treatments_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CrossBorderTreatmentsController.getApiV5CrossBorderTreatmentsGetAsync") getApiV5CrossBorderTreatmentsGetAsync

> -params[:type]  can be set as hospital or clinic
>       if not set at all the default is clinics only
> -params[:treatments] comma seperated treatments ids to filter with
> -params[:speciality_id] 
> -params[:country_codes] comma country codes ids to filter with
> -params[:country_code] for old apis to work send 1 country code to filter by
> cross border treatments should be sorted by price


```java
void getApiV5CrossBorderTreatmentsGetAsync(
        final String type,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String type = "type";
// Invoking the API call with sample inputs
crossBorderTreatments.getApiV5CrossBorderTreatmentsGetAsync(type, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_states_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CrossBorderTreatmentsController.getStatesGetAsync") getStatesGetAsync

> TODO: Add Description


```java
void getStatesGetAsync(
        final String countryCode,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| countryCode |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String countryCode = "country_code";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
crossBorderTreatments.getStatesGetAsync(countryCode, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_cross_border_treatments_countries_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CrossBorderTreatmentsController.getApiV5CrossBorderTreatmentsCountriesGetAsync") getApiV5CrossBorderTreatmentsCountriesGetAsync

> TODO: Add Description


```java
void getApiV5CrossBorderTreatmentsCountriesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
crossBorderTreatments.getApiV5CrossBorderTreatmentsCountriesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_treatments_groups_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CrossBorderTreatmentsController.getApiV5TreatmentsGroupsGetAsync") getApiV5TreatmentsGroupsGetAsync

> TODO: Add Description


```java
void getApiV5TreatmentsGroupsGetAsync(
        final String lang,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lang |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String lang = "lang";
// Invoking the API call with sample inputs
crossBorderTreatments.getApiV5TreatmentsGroupsGetAsync(lang, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="comments_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.CommentsController") CommentsController

### Get singleton instance

The singleton instance of the ``` CommentsController ``` class can be accessed from the API Client.

```java
CommentsController comments = client.getComments();
```

### <a name="get_api_v5_news574efc7969702d370a130000_comments_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CommentsController.getApiV5News574efc7969702d370a130000CommentsGetAsync") getApiV5News574efc7969702d370a130000CommentsGetAsync

> Index comments with pagination 
> params[:page] = page number
> returns all comments
> returns 5 comments per page


```java
void getApiV5News574efc7969702d370a130000CommentsGetAsync(
        final int page,
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int page = 243;
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
comments.getApiV5News574efc7969702d370a130000CommentsGetAsync(page, xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_news580f73426d61725cae000000_comments_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CommentsController.createApiV5News580f73426d61725cae000000CommentsPostAsync") createApiV5News580f73426d61725cae000000CommentsPostAsync

> TODO: Add Description


```java
void createApiV5News580f73426d61725cae000000CommentsPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String commentBody,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| commentBody |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String commentBody = "comment[body]";
// Invoking the API call with sample inputs
comments.createApiV5News580f73426d61725cae000000CommentsPostAsync(xAuthenticationToken, xSessionId, commentBody, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_news5908b86669702d0d34090000_comments5912e99469702d330f170000_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CommentsController.updateApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000PutAsync") updateApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000PutAsync

> TODO: Add Description


```java
void updateApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000PutAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String commentBody,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| commentBody |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String commentBody = "comment[body]";
// Invoking the API call with sample inputs
comments.updateApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000PutAsync(xAuthenticationToken, xSessionId, commentBody, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_api_v5_news5908b86669702d0d34090000_comments5912e99469702d330f170000_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.CommentsController.deleteApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000DeleteAsync") deleteApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000DeleteAsync

> TODO: Add Description


```java
void deleteApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000DeleteAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
comments.deleteApiV5News5908b86669702d0d34090000Comments5912e99469702d330f170000DeleteAsync(xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="paypal_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.PaypalController") PaypalController

### Get singleton instance

The singleton instance of the ``` PaypalController ``` class can be accessed from the API Client.

```java
PaypalController paypal = client.getPaypal();
```

### <a name="create_token_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PaypalController.createTokenPostAsync") createTokenPostAsync

> TODO: Add Description


```java
void createTokenPostAsync(
        final String contentType,
        final String grantType,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| grantType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String contentType = "Content-Type";
String grantType = "grant_type";
// Invoking the API call with sample inputs
paypal.createTokenPostAsync(contentType, grantType, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="dicom_mr_es_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.DicomMREsController") DicomMREsController

### Get singleton instance

The singleton instance of the ``` DicomMREsController ``` class can be accessed from the API Client.

```java
DicomMREsController dicomMREs = client.getDicomMREs();
```

### <a name="get_api_v5_individuals20225_mres_dicom_mres_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.DicomMREsController.getApiV5Individuals20225MresDicomMresGetAsync") getApiV5Individuals20225MresDicomMresGetAsync

> TODO: Add Description


```java
void getApiV5Individuals20225MresDicomMresGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
dicomMREs.getApiV5Individuals20225MresDicomMresGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="video_requests_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.VideoRequestsController") VideoRequestsController

### Get singleton instance

The singleton instance of the ``` VideoRequestsController ``` class can be accessed from the API Client.

```java
VideoRequestsController videoRequests = client.getVideoRequests();
```

### <a name="create_api_v5_video_requests_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.createApiV5VideoRequestsPostAsync") createApiV5VideoRequestsPostAsync

>     Create new reservation request
>     
>   URL: /reservation_requests
>   Method: POST
>   @param doctor_id
>   @param address
>   @param address_details
>   @param mobile_number
>   @param country_code
>   @param patient_latitude
>   @param patient_longitude
>   @param country_code] mobile country code
>   @header [String] X-Authentication-Token
>   @header [String] X-Session-Id
>   @return [JsonArray]  errors  ( code: 422 )


```java
void createApiV5VideoRequestsPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String doctorId,
        final String howPatientFeels,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| doctorId |  ``` Required ```  | TODO: Add a parameter description |
| howPatientFeels |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String doctorId = "doctor_id";
String howPatientFeels = "how_patient_feels";
// Invoking the API call with sample inputs
videoRequests.createApiV5VideoRequestsPostAsync(xSessionId, xAuthenticationToken, doctorId, howPatientFeels, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_video_requests755_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.updateApiV5VideoRequests755PutAsync") updateApiV5VideoRequests755PutAsync

> Doctor reject resesrvation request


```java
void updateApiV5VideoRequests755PutAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String xAppId,
        final String currentStatus,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |
| currentStatus |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String xAppId = "X-App-Id";
String currentStatus = "current_status";
// Invoking the API call with sample inputs
videoRequests.updateApiV5VideoRequests755PutAsync(xAuthenticationToken, xSessionId, xAppId, currentStatus, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_video_requests32_ratings_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.createApiV5VideoRequests32RatingsPostAsync") createApiV5VideoRequests32RatingsPostAsync

> TODO: Add Description


```java
void createApiV5VideoRequests32RatingsPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String ratingStars,
        final String ratingReview,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| ratingStars |  ``` Required ```  | TODO: Add a parameter description |
| ratingReview |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication_Token";
String xSessionId = "X-Session_Id";
String ratingStars = "rating[stars]";
String ratingReview = "rating[review]";
// Invoking the API call with sample inputs
videoRequests.createApiV5VideoRequests32RatingsPostAsync(xAuthenticationToken, xSessionId, ratingStars, ratingReview, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_video_requests_check_validity_code_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.createApiV5VideoRequestsCheckValidityCodePostAsync") createApiV5VideoRequestsCheckValidityCodePostAsync

> TODO: Add Description


```java
void createApiV5VideoRequestsCheckValidityCodePostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String promoCode,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| promoCode |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-session-id";
String xAuthenticationToken = "X-authentication-token";
String promoCode = "promo_code";
// Invoking the API call with sample inputs
videoRequests.createApiV5VideoRequestsCheckValidityCodePostAsync(xSessionId, xAuthenticationToken, promoCode, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_video_requests2668_add_case_info_patch_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.updateApiV5VideoRequests2668AddCaseInfoPatchAsync") updateApiV5VideoRequests2668AddCaseInfoPatchAsync

> TODO: Add Description


```java
void updateApiV5VideoRequests2668AddCaseInfoPatchAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String caseInfo,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| caseInfo |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String caseInfo = "case_info";
// Invoking the API call with sample inputs
videoRequests.updateApiV5VideoRequests2668AddCaseInfoPatchAsync(xAuthenticationToken, xSessionId, caseInfo, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_video_requests28_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.getApiV5VideoRequests28GetAsync") getApiV5VideoRequests28GetAsync

>     Create new reservation request
>     
>   URL: /video_requests
>   Method: POST
>   @param doctor_id
>   @param address
>   @param address_details
>   @param mobile_number
>   @param country_code
>   @param patient_latitude
>   @param patient_longitude
>   @param country_code] mobile country code
>   @header [String] X-Authentication-Token
>   @header [String] X-Session-Id
>   @return [JsonArray]  errors  ( code: 422 )


```java
void getApiV5VideoRequests28GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
videoRequests.getApiV5VideoRequests28GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_doctors_with_relations_embeded_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.getApiV5DoctorsWithRelationsEmbededGetAsync") getApiV5DoctorsWithRelationsEmbededGetAsync

> speciality_id&career_level_id


```java
void getApiV5DoctorsWithRelationsEmbededGetAsync(
        final String type,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String type = "type";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
videoRequests.getApiV5DoctorsWithRelationsEmbededGetAsync(type, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_conference_rooms54141_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.getApiV5ConferenceRooms54141GetAsync") getApiV5ConferenceRooms54141GetAsync

> TODO: Add Description


```java
void getApiV5ConferenceRooms54141GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
videoRequests.getApiV5ConferenceRooms54141GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_video_requests31_show_case_info_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.getApiV5VideoRequests31ShowCaseInfoGetAsync") getApiV5VideoRequests31ShowCaseInfoGetAsync

> TODO: Add Description


```java
void getApiV5VideoRequests31ShowCaseInfoGetAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
videoRequests.getApiV5VideoRequests31ShowCaseInfoGetAsync(xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_api_v5_video_requests72_put_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.updateApiV5VideoRequests72PutAsync") updateApiV5VideoRequests72PutAsync

> increment intervals count


```java
void updateApiV5VideoRequests72PutAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String currentStatus,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| currentStatus |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String currentStatus = "current_status";
// Invoking the API call with sample inputs
videoRequests.updateApiV5VideoRequests72PutAsync(xAuthenticationToken, xSessionId, currentStatus, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_video_requests_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoRequestsController.getApiV5VideoRequestsGetAsync") getApiV5VideoRequestsGetAsync

> TODO: Add Description


```java
void getApiV5VideoRequestsGetAsync(
        final String status,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| status |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String status = "status";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
videoRequests.getApiV5VideoRequestsGetAsync(status, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="prescription_images_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.PrescriptionImagesController") PrescriptionImagesController

### Get singleton instance

The singleton instance of the ``` PrescriptionImagesController ``` class can be accessed from the API Client.

```java
PrescriptionImagesController prescriptionImages = client.getPrescriptionImages();
```

### <a name="get_api_v5_prescription_images_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionImagesController.getApiV5PrescriptionImagesGetAsync") getApiV5PrescriptionImagesGetAsync

> TODO: Add Description


```java
void getApiV5PrescriptionImagesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptionImages.getApiV5PrescriptionImagesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_prescription_images58d23b9b5461720ee2000000_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionImagesController.getApiV5PrescriptionImages58d23b9b5461720ee2000000GetAsync") getApiV5PrescriptionImages58d23b9b5461720ee2000000GetAsync

> TODO: Add Description


```java
void getApiV5PrescriptionImages58d23b9b5461720ee2000000GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptionImages.getApiV5PrescriptionImages58d23b9b5461720ee2000000GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_reservation_requests2668_prescription_images_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionImagesController.createApiV5ReservationRequests2668PrescriptionImagesPostAsync") createApiV5ReservationRequests2668PrescriptionImagesPostAsync

> TODO: Add Description


```java
void createApiV5ReservationRequests2668PrescriptionImagesPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String prescriptionImageImage,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| prescriptionImageImage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String prescriptionImageImage = "prescription_image[image]";
// Invoking the API call with sample inputs
prescriptionImages.createApiV5ReservationRequests2668PrescriptionImagesPostAsync(xSessionId, xAuthenticationToken, prescriptionImageImage, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests2668_prescription_images_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.PrescriptionImagesController.getApiV5ReservationRequests2668PrescriptionImagesGetAsync") getApiV5ReservationRequests2668PrescriptionImagesGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests2668PrescriptionImagesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
prescriptionImages.getApiV5ReservationRequests2668PrescriptionImagesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="likes_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.LikesController") LikesController

### Get singleton instance

The singleton instance of the ``` LikesController ``` class can be accessed from the API Client.

```java
LikesController likes = client.getLikes();
```

### <a name="create_api_v5_news57e3b4f769702d1ae60b0000_likes_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LikesController.createApiV5News57e3b4f769702d1ae60b0000LikesPostAsync") createApiV5News57e3b4f769702d1ae60b0000LikesPostAsync

> TODO: Add Description


```java
void createApiV5News57e3b4f769702d1ae60b0000LikesPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
likes.createApiV5News57e3b4f769702d1ae60b0000LikesPostAsync(xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_api_v5_news57e3b4f769702d1ae60b0000_likes_destroy_like_delete_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LikesController.deleteApiV5News57e3b4f769702d1ae60b0000LikesDestroyLikeDeleteAsync") deleteApiV5News57e3b4f769702d1ae60b0000LikesDestroyLikeDeleteAsync

> TODO: Add Description


```java
void deleteApiV5News57e3b4f769702d1ae60b0000LikesDestroyLikeDeleteAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
// Invoking the API call with sample inputs
likes.deleteApiV5News57e3b4f769702d1ae60b0000LikesDestroyLikeDeleteAsync(xAuthenticationToken, xSessionId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="video_extension_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.VideoExtensionController") VideoExtensionController

### Get singleton instance

The singleton instance of the ``` VideoExtensionController ``` class can be accessed from the API Client.

```java
VideoExtensionController videoExtension = client.getVideoExtension();
```

### <a name="create_api_v5_video_extensions_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoExtensionController.createApiV5VideoExtensionsPostAsync") createApiV5VideoExtensionsPostAsync

> TODO: Add Description


```java
void createApiV5VideoExtensionsPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String contentType,
        final CreateRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String xAuthenticationToken = "X-Authentication-Token";
    String xSessionId = "X-Session-Id";
    String contentType = "Content-Type";
    CreateRequest body = new CreateRequest();
    // Invoking the API call with sample inputs
    videoExtension.createApiV5VideoExtensionsPostAsync(xAuthenticationToken, xSessionId, contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_api_v5_video_extensions76_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.VideoExtensionController.getApiV5VideoExtensions76GetAsync") getApiV5VideoExtensions76GetAsync

> TODO: Add Description


```java
void getApiV5VideoExtensions76GetAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String contentType,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| contentType |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String contentType = "Content-Type";
// Invoking the API call with sample inputs
videoExtension.getApiV5VideoExtensions76GetAsync(xAuthenticationToken, xSessionId, contentType, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="edit_profile_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.EditProfileController") EditProfileController

### Get singleton instance

The singleton instance of the ``` EditProfileController ``` class can be accessed from the API Client.

```java
EditProfileController editProfile = client.getEditProfile();
```

### <a name="update_api_v5_update_profile_patch_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.EditProfileController.updateApiV5UpdateProfilePatchAsync") updateApiV5UpdateProfilePatchAsync

> TODO: Add Description


```java
void updateApiV5UpdateProfilePatchAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String individualFirstName,
        final String individualLastName,
        final String individualAvatar,
        final String individualAddressStreet,
        final String individualAddressBuilding,
        final String individualAddressCity,
        final String individualAddressCountry,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| individualFirstName |  ``` Required ```  | TODO: Add a parameter description |
| individualLastName |  ``` Required ```  | TODO: Add a parameter description |
| individualAvatar |  ``` Required ```  | TODO: Add a parameter description |
| individualAddressStreet |  ``` Required ```  | TODO: Add a parameter description |
| individualAddressBuilding |  ``` Required ```  | TODO: Add a parameter description |
| individualAddressCity |  ``` Required ```  | TODO: Add a parameter description |
| individualAddressCountry |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String individualFirstName = "individual[first_name]";
String individualLastName = "individual[last_name]";
String individualAvatar = "individual[avatar]";
String individualAddressStreet = "individual[address[street]]";
String individualAddressBuilding = "individual[address[building]]";
String individualAddressCity = "individual[address[city]]";
String individualAddressCountry = "individual[address[country]]";
// Invoking the API call with sample inputs
editProfile.updateApiV5UpdateProfilePatchAsync(xAuthenticationToken, xSessionId, individualFirstName, individualLastName, individualAvatar, individualAddressStreet, individualAddressBuilding, individualAddressCity, individualAddressCountry, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_individuals_edit_identifier_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.EditProfileController.createApiV5IndividualsEditIdentifierPostAsync") createApiV5IndividualsEditIdentifierPostAsync

> first step to edit .. 
> sends confirmation and save it in the cache


```java
void createApiV5IndividualsEditIdentifierPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String identifier,
        final String type,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| identifier |  ``` Required ```  | TODO: Add a parameter description |
| type |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String identifier = "identifier";
String type = "type";
// Invoking the API call with sample inputs
editProfile.createApiV5IndividualsEditIdentifierPostAsync(xAuthenticationToken, xSessionId, identifier, type, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_individuals_update_identifier_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.EditProfileController.createApiV5IndividualsUpdateIdentifierPostAsync") createApiV5IndividualsUpdateIdentifierPostAsync

> final step to confirm the update ..
> 


```java
void createApiV5IndividualsUpdateIdentifierPostAsync(
        final String xAuthenticationToken,
        final String xSessionId,
        final String identifier,
        final String confirmationCode,
        final String type,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| identifier |  ``` Required ```  | TODO: Add a parameter description |
| confirmationCode |  ``` Required ```  | TODO: Add a parameter description |
| type |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xAuthenticationToken = "X-Authentication-Token";
String xSessionId = "X-Session-Id";
String identifier = "identifier";
String confirmationCode = "confirmation_code";
String type = "type";
// Invoking the API call with sample inputs
editProfile.createApiV5IndividualsUpdateIdentifierPostAsync(xAuthenticationToken, xSessionId, identifier, confirmationCode, type, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="advertisements_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.AdvertisementsController") AdvertisementsController

### Get singleton instance

The singleton instance of the ``` AdvertisementsController ``` class can be accessed from the API Client.

```java
AdvertisementsController advertisements = client.getAdvertisements();
```

### <a name="get_api_v5_advertisements_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.AdvertisementsController.getApiV5AdvertisementsGetAsync") getApiV5AdvertisementsGetAsync

> TODO: Add Description


```java
void getApiV5AdvertisementsGetAsync(
        final String advertisementPage,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| advertisementPage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String advertisementPage = "advertisement_page";
// Invoking the API call with sample inputs
advertisements.getApiV5AdvertisementsGetAsync(advertisementPage, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="reset_password_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.ResetPasswordController") ResetPasswordController

### Get singleton instance

The singleton instance of the ``` ResetPasswordController ``` class can be accessed from the API Client.

```java
ResetPasswordController resetPassword = client.getResetPassword();
```

### <a name="create_api_v5_reset_passwords_send_reset_password_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ResetPasswordController.createApiV5ResetPasswordsSendResetPasswordPostAsync") createApiV5ResetPasswordsSendResetPasswordPostAsync

> TODO: Add Description


```java
void createApiV5ResetPasswordsSendResetPasswordPostAsync(
        final String receiver,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| receiver |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String receiver = "receiver";
// Invoking the API call with sample inputs
resetPassword.createApiV5ResetPasswordsSendResetPasswordPostAsync(receiver, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_reset_passwords_reset_password_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ResetPasswordController.createApiV5ResetPasswordsResetPasswordPostAsync") createApiV5ResetPasswordsResetPasswordPostAsync

> TODO: Add Description


```java
void createApiV5ResetPasswordsResetPasswordPostAsync(
        final String receiver,
        final String token,
        final String password,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| receiver |  ``` Required ```  | TODO: Add a parameter description |
| token |  ``` Required ```  | TODO: Add a parameter description |
| password |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String receiver = "receiver";
String token = "token";
String password = "password";
// Invoking the API call with sample inputs
resetPassword.createApiV5ResetPasswordsResetPasswordPostAsync(receiver, token, password, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="messages_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.MessagesController") MessagesController

### Get singleton instance

The singleton instance of the ``` MessagesController ``` class can be accessed from the API Client.

```java
MessagesController messages = client.getMessages();
```

### <a name="get_api_v5_messages_get_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MessagesController.getApiV5MessagesGetGetAsync") getApiV5MessagesGetGetAsync

>  # URL         => /messages/get
>   # Method      => GET
>   # Description => Get List of Messages
>   #==Parameters
>   # range => represent the number of messages per page (default => 500)
>   # page  => page number (default => 1)
>   # email => curent user email
>   # authentication_token => curent user authentication_token (you get this token after login/registration)
>   #==Response/JSON
>   # {success: true , messages: array_of_messages}
>   # Every message in the array consists of:
>   # 1. date    => last reply date (Or message creation date if no replies)
>   # 2. date_unix_timestamp
>   # 3. id      => message id
>   # 4. title   => message title
>   # 5. is_seen => 1/0
>   # 6. is_sent => 1/0
>   # 7. Array_of_Users
>   #   Every user in the array consists of:
>   #     1. first_name
>   #     2. id
>   #     3. avatar => Object
>   #           {url: value , icon: {url: value},thumb: {url: value}, profile: {url: value}, profile_big: {url: value} }
>   # 8. last_reply => last reply on the message
>   #
>   # NOTE: In case of error response will be => {sucess: false , code: error_code , message: error_message }
>   # Errors:
>   #   1. UnauthorizedAccessError ( code: 401 )


```java
void getApiV5MessagesGetGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
messages.getApiV5MessagesGetGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_messages_get_replies_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MessagesController.getApiV5MessagesGetRepliesGetAsync") getApiV5MessagesGetRepliesGetAsync

>  # URL         => /messages/get_replies
>   # Method      => GET
>   # Description => Get List of Message Replies
>   #==Parameters
>   # range      => represent the number of replies per page (default => 500)
>   # page       => page number (default => 1)
>   # message_id => id of the messages which the required replies belongs to
>   # email      => curent user email
>   # authentication_token => curent user authentication_token (you get this token after login/registration)
>   #==Response/JSON
>   # {success: true , replies: array_of_replies}
>   # array_of_replies => including the 'message' itself
>   # Every Reply in the array consists of:
>   # 1. date    => creation date
>   # 2. date_unix_timestamp
>   # 3. body    => reply/message content
>   # 4. id
>   # 5. user    => owner of the current reply/message
>   #     Object consists of:
>   #     1. full_name
>   #     2. id
>   #     3. avatar => Object
>   #           {url: value , icon: {url: value},thumb: {url: value}, profile: {url: value}, profile_big: {url: value} }
>   #
>   # NOTE: In case of error response will be => {sucess: false , code: error_code , message: error_message }
>   # Errors:
>   #   1. UnauthorizedAccessError ( code: 401 )
>   #   2. BadRequestError ( code: 400 )
>   #   3. NotFoundError   ( code: 404 )


```java
void getApiV5MessagesGetRepliesGetAsync(
        final int messageId,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageId |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int messageId = 80;
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
messages.getApiV5MessagesGetRepliesGetAsync(messageId, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_messages_send_message_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MessagesController.createApiV5MessagesSendMessagePostAsync") createApiV5MessagesSendMessagePostAsync

> # URL         => /messages/send_message
>   # Method      => POST
>   #==Parameters
>   # title
>   # body
>   # users_ids  => comma seperated ids of the receivers (ex: 256,10365)
>   # email      => curent user email
>   # authentication_token => curent user authentication_token (you get this token after login/registration)
>   #==Response/JSON
>   # { success: true }
>   #
>   # NOTE: In case of error response will be => {sucess: false , code: error_code , message: error_message }
>   # Errors:
>   #   1. UnauthorizedAccessError ( code: 401 )
>   #   2. BadRequestError         ( code: 400 )
>   #==Description
>   # this function send message to required receiver, in case many receivers => a different message
>   # will be created for each receiver (one to one)


```java
void createApiV5MessagesSendMessagePostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String title,
        final String body,
        final String usersIds,
        final String attachment,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| title |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| usersIds |  ``` Required ```  | TODO: Add a parameter description |
| attachment |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String title = "title";
String body = "body";
String usersIds = "users_ids";
String attachment = "attachment";
// Invoking the API call with sample inputs
messages.createApiV5MessagesSendMessagePostAsync(xSessionId, xAuthenticationToken, title, body, usersIds, attachment, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_messages_send_reply_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MessagesController.createApiV5MessagesSendReplyPostAsync") createApiV5MessagesSendReplyPostAsync

> # URL       => /messages/send_reply
>   # Method    => POST
>   #==Parameters
>   # body       => reply content
>   # message_id => send reply to the message with that ID
>   # email      => curent user email
>   # authentication_token => curent user authentication_token (you get this token after login/registration)
>   #==Response/JSON
>   # { success: true }
>   #
>   # NOTE: In case of error response will be => {sucess: false , code: error_code , message: error_message }
>   # Errors:
>   #   1. UnauthorizedAccessError ( code: 401 )
>   #   2. BadRequestError         ( code: 400 )
>   #   3. ForbiddenError          ( code: 403 )


```java
void createApiV5MessagesSendReplyPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String body,
        final String messageId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| messageId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String body = "body";
String messageId = "message_id";
// Invoking the API call with sample inputs
messages.createApiV5MessagesSendReplyPostAsync(xSessionId, xAuthenticationToken, body, messageId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_messages_search_users_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MessagesController.getApiV5MessagesSearchUsersGetAsync") getApiV5MessagesSearchUsersGetAsync

>  # URL         => /messages/search_users
>   # Method      => GET
>   # Description => Search for the users which you are able to send them messages
>   #                Staff to Staff and patients
>   #                Patients to Doctors
>   #                Doctors to Patients which have PMR access on them and vice versa
>   #==Parameters
>   # term  => search for a user with name contains this term/pattern
>   # range => (Optional) default range is 10
>   # email => curent user email
>   # authentication_token => curent user authentication_token (you get this token after login/registration)
>   #==Response/JSON
>   # {success: true , messages: array_of_users}
>   # Every user in the array consists of:
>   # 1. full_name    => user full name
>   # 2. id           => user id
>   # 3. avatar       => user images urls/ with different sizes
>   #     Object consists of:
>   #       {url: value , icon: {url: value},thumb: {url: value}, profile: {url: value}, profile_big: {url: value} }
>   #
>   # NOTE: In case of error response will be => {sucess: false , code: error_code , message: error_message }
>   # Errors:
>   #   1. UnauthorizedAccessError ( code: 401 )
>   #   2. BadRequestError         ( code: 400 )


```java
void getApiV5MessagesSearchUsersGetAsync(
        final String term,
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| term |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String term = "term";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
messages.getApiV5MessagesSearchUsersGetAsync(term, xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="lab_request_images_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.LabRequestImagesController") LabRequestImagesController

### Get singleton instance

The singleton instance of the ``` LabRequestImagesController ``` class can be accessed from the API Client.

```java
LabRequestImagesController labRequestImages = client.getLabRequestImages();
```

### <a name="get_api_v5_lab_request_images_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestImagesController.getApiV5LabRequestImagesGetAsync") getApiV5LabRequestImagesGetAsync

> TODO: Add Description


```java
void getApiV5LabRequestImagesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequestImages.getApiV5LabRequestImagesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_lab_request_images58d23b9b5461720ee2000000_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestImagesController.getApiV5LabRequestImages58d23b9b5461720ee2000000GetAsync") getApiV5LabRequestImages58d23b9b5461720ee2000000GetAsync

> TODO: Add Description


```java
void getApiV5LabRequestImages58d23b9b5461720ee2000000GetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequestImages.getApiV5LabRequestImages58d23b9b5461720ee2000000GetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_reservation_requests3756_lab_request_images_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestImagesController.createApiV5ReservationRequests3756LabRequestImagesPostAsync") createApiV5ReservationRequests3756LabRequestImagesPostAsync

> TODO: Add Description


```java
void createApiV5ReservationRequests3756LabRequestImagesPostAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String labRequestImageImage,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| labRequestImageImage |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String labRequestImageImage = "lab_request_image[image]";
// Invoking the API call with sample inputs
labRequestImages.createApiV5ReservationRequests3756LabRequestImagesPostAsync(xSessionId, xAuthenticationToken, labRequestImageImage, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_reservation_requests3827_lab_request_images_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.LabRequestImagesController.getApiV5ReservationRequests3827LabRequestImagesGetAsync") getApiV5ReservationRequests3827LabRequestImagesGetAsync

> TODO: Add Description


```java
void getApiV5ReservationRequests3827LabRequestImagesGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
// Invoking the API call with sample inputs
labRequestImages.getApiV5ReservationRequests3827LabRequestImagesGetAsync(xSessionId, xAuthenticationToken, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="measurements_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.MeasurementsController") MeasurementsController

### Get singleton instance

The singleton instance of the ``` MeasurementsController ``` class can be accessed from the API Client.

```java
MeasurementsController measurements = client.getMeasurements();
```

### <a name="create_api_v5_diabetes_add_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsController.createApiV5DiabetesAddPostAsync") createApiV5DiabetesAddPostAsync

> # Specifications :-
> <b>URL : </b>/diabetes/add  
> <b>Method : </b>POST  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> -diabetes : String contains fields data in json (array) format  
> Ex: "[{ 'field_name': "" }]" --> string "[]" not json object/array  
> 
> Each Object in the array consists of:  
> 1- field_name  
> 2- field_value  
> 3- date Or date_timestamp (with date_timestamp you don't need to send date field again in the relations array)  
> 4- relations => Array_of_relations  
> Every relation in the array consists of the same previous attributes/keys  
> ( date, field_name, field_value )  
> <b>Note in Pregnancy App</b>  
> "field_name" param possible values are => glucose, blood_pressure, weight  
> When the "field_name" value is glucose then the "field_name" value inside the relations will be  => "last meal", "activity"  
> The "last meal" "field_value" could be => Before Breakfast, After Breakfast, Before Lunch, After Lunch, At Fasting  
> The "activity"  "field_value" could be => No exercise, Light, Moderate, Heavy  
> # Response/JSON :-
> 1- {}, status: :ok  
> 2- {}, status: :unprocessable_entity


```java
void createApiV5DiabetesAddPostAsync(
        final String diabetes,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| diabetes |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String diabetes = "diabetes";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
measurements.createApiV5DiabetesAddPostAsync(diabetes, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_diabetes_get_summary_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsController.getApiV5DiabetesGetSummaryGetAsync") getApiV5DiabetesGetSummaryGetAsync

> # Specifications :-
> <b>URL : </b>/diabetes/get_summary  
> <b>Method : </b>GET  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> # Response/JSON :-
> 1- <b>{measurements: Array_of_values}, status: :ok</b>  
> &nbsp;&nbsp;Every Value in the array (sorted by date) consists of:  
> &nbsp;&nbsp;1- created_at  
> &nbsp;&nbsp;2- date  
> &nbsp;&nbsp;3- date_timestamp  
> &nbsp;&nbsp;4- field_name  
> &nbsp;&nbsp;5- field_value  
> &nbsp;&nbsp;6- id  
> &nbsp;&nbsp;7- is_pmr  
> &nbsp;&nbsp;8- updated_at  
> &nbsp;&nbsp;9- user_id  
> &nbsp;&nbsp;10- relations   => Array_of_relations  
> &nbsp;&nbsp;&nbsp;&nbsp;Every relation in the array consists of the same previous attributes/keys  
> &nbsp;&nbsp;&nbsp;&nbsp;( created_at, date, field_name, field_value, id, is_pmr, updated_at, user_id )  
> 2- <b>{}, status: :unprocessable_entity</b>


```java
void getApiV5DiabetesGetSummaryGetAsync(
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
measurements.getApiV5DiabetesGetSummaryGetAsync(xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_diabetes_get_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsController.getApiV5DiabetesGetGetAsync") getApiV5DiabetesGetGetAsync

> # Specifications :-
> <b>URL : </b>/diabetes/get  
> <b>Method : </b>GET  
> <b>Description : </b>retrieve the corresponding diabetes info to the provided user with the diabetes type and build back the relations if it exists  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- type  
> <b>Note in Pregnancy App</b>  
> "type" param possible values are => glucose, blood_pressure, weight
> # Response/JSON :-
> 1- <b>{measurements: Array_of_values}, status: :ok</b>  
> &nbsp;&nbsp;Every Value in the array (sorted by date) consists of:  
> &nbsp;&nbsp;1- created_at  
> &nbsp;&nbsp;2- date  
> &nbsp;&nbsp;3- date_timestamp  
> &nbsp;&nbsp;4- field_name  
> &nbsp;&nbsp;5- field_value  
> &nbsp;&nbsp;6- id  
> &nbsp;&nbsp;7- is_pmr  
> &nbsp;&nbsp;8- updated_at  
> &nbsp;&nbsp;9- user_id  
> &nbsp;&nbsp;10- relations   => Array_of_relations  
> &nbsp;&nbsp;&nbsp;&nbsp;Every relation in the array consists of the same previous attributes/keys  
> &nbsp;&nbsp;&nbsp;&nbsp;( created_at, date, field_name, field_value, id, is_pmr, updated_at, user_id )  
> 2- <b>{}, status: :unprocessable_entity</b>


```java
void getApiV5DiabetesGetGetAsync(
        final String type,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String type = "type";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
measurements.getApiV5DiabetesGetGetAsync(type, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_diabetes_visualized_data_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.MeasurementsController.createApiV5DiabetesVisualizedDataPostAsync") createApiV5DiabetesVisualizedDataPostAsync

> # Specifications :-
> <b>URL : </b>/diabetes/visualized_data  
> <b>Method : </b>POST  
> # Parameters :-
> <b>Headers :</b>  
> 1- X-Authentication-Token  
> 2- X-Session-Id  
> 3- X-App-Id : should be sent only when using doctor app  
> <b>Params :</b>  
> 1- send_email  
> 2- type  
> <b>Note in Pregnancy App</b>  
> "type" param possible values are => glucose, blood_pressure, weight  
> # Response/JSON :-
> 1- <b>{"message":"mail sent"}, status: :ok</b>  
> 2- <b>{:graph => graph_url, count: count}, status: :ok</b>  
> 3- <b>{}, status: :unprocessable_entity</b>  
> providing Graph to the matched requested diabetes info  
> Two cases will apply:  
> 1- if the request is to send email contains the graph url to some one provided in the request params e.g "send_email: bla@bla.bla"  
> 2- if the request is just to get the corresponding graph to the matched [type, user]  


```java
void createApiV5DiabetesVisualizedDataPostAsync(
        final String sendEmail,
        final String type,
        final String xSessionId,
        final String xAuthenticationToken,
        final String xAppId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| sendEmail |  ``` Required ```  | TODO: Add a parameter description |
| type |  ``` Required ```  | TODO: Add a parameter description |
| xSessionId |  ``` Required ```  | TODO: Add a parameter description |
| xAuthenticationToken |  ``` Required ```  | TODO: Add a parameter description |
| xAppId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String sendEmail = "send_email";
String type = "type";
String xSessionId = "X-Session-Id";
String xAuthenticationToken = "X-Authentication-Token";
String xAppId = "X-App-Id";
// Invoking the API call with sample inputs
measurements.createApiV5DiabetesVisualizedDataPostAsync(sendEmail, type, xSessionId, xAuthenticationToken, xAppId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="confirmation_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.balsamee.admin.controllers.ConfirmationController") ConfirmationController

### Get singleton instance

The singleton instance of the ``` ConfirmationController ``` class can be accessed from the API Client.

```java
ConfirmationController confirmation = client.getConfirmation();
```

### <a name="create_api_v5_confirmations_send_confirmation_sms_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ConfirmationController.createApiV5ConfirmationsSendConfirmationSmsPostAsync") createApiV5ConfirmationsSendConfirmationSmsPostAsync

> TODO: Add Description


```java
void createApiV5ConfirmationsSendConfirmationSmsPostAsync(
        final String xStatus,
        final String individualId,
        final String individualMobileNumber,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xStatus |  ``` Required ```  | TODO: Add a parameter description |
| individualId |  ``` Required ```  | TODO: Add a parameter description |
| individualMobileNumber |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xStatus = "X-Status";
String individualId = "individual[id]";
String individualMobileNumber = "individual[mobile_number]";
// Invoking the API call with sample inputs
confirmation.createApiV5ConfirmationsSendConfirmationSmsPostAsync(xStatus, individualId, individualMobileNumber, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_confirmations_confirm_email_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ConfirmationController.getApiV5ConfirmationsConfirmEmailGetAsync") getApiV5ConfirmationsConfirmEmailGetAsync

> TODO: Add Description


```java
void getApiV5ConfirmationsConfirmEmailGetAsync(
        final int individualId,
        final String email,
        final String confirmationCode,
        final String xStatus,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| individualId |  ``` Required ```  | TODO: Add a parameter description |
| email |  ``` Required ```  | TODO: Add a parameter description |
| confirmationCode |  ``` Required ```  | TODO: Add a parameter description |
| xStatus |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int individualId = 38;
String email = "email";
String confirmationCode = "confirmation_code";
String xStatus = "X-Status";
// Invoking the API call with sample inputs
confirmation.getApiV5ConfirmationsConfirmEmailGetAsync(individualId, email, confirmationCode, xStatus, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_api_v5_confirmations_confirm_mobile_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ConfirmationController.getApiV5ConfirmationsConfirmMobileGetAsync") getApiV5ConfirmationsConfirmMobileGetAsync

> TODO: Add Description


```java
void getApiV5ConfirmationsConfirmMobileGetAsync(
        final int individualId,
        final double mobileNumber,
        final int confirmationCode,
        final String xStatus,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| individualId |  ``` Required ```  | TODO: Add a parameter description |
| mobileNumber |  ``` Required ```  | TODO: Add a parameter description |
| confirmationCode |  ``` Required ```  | TODO: Add a parameter description |
| xStatus |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int individualId = 38;
double mobileNumber = 38.3323440693004;
int confirmationCode = 38;
String xStatus = "X-Status";
// Invoking the API call with sample inputs
confirmation.getApiV5ConfirmationsConfirmMobileGetAsync(individualId, mobileNumber, confirmationCode, xStatus, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_api_v5_confirmations_send_confirmation_mail_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.balsamee.admin.controllers.ConfirmationController.createApiV5ConfirmationsSendConfirmationMailPostAsync") createApiV5ConfirmationsSendConfirmationMailPostAsync

> TODO: Add Description


```java
void createApiV5ConfirmationsSendConfirmationMailPostAsync(
        final String xStatus,
        final String individualId,
        final String individualEmail,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| xStatus |  ``` Required ```  | TODO: Add a parameter description |
| individualId |  ``` Required ```  | TODO: Add a parameter description |
| individualEmail |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String xStatus = "X-Status";
String individualId = "individual[id]";
String individualEmail = "individual[email]";
// Invoking the API call with sample inputs
confirmation.createApiV5ConfirmationsSendConfirmationMailPostAsync(xStatus, individualId, individualEmail, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



