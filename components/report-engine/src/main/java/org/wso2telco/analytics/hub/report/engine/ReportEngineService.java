/*
 *  Copyright (c) 2016 WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2telco.analytics.hub.report.engine;

import org.json.JSONException;

import java.io.File;
import java.util.ArrayList;

public interface ReportEngineService {

    void generateReport(String tableName, String query, String reportName, int maxLength, String reportType, String columns, String fromDate, String toDate, String sp);

    void generatePDFReport(String tableName, String query, String reportName, int maxLength, String reportType,
                           String direction, String year, String month, boolean isServiceProvider, String
                                   loggedInUserInfo, String billingInfo, String username) throws JSONException;

    void generateZipFile(String carbonHome, String path, String[] fileNames, String user, String reportType);

    ArrayList<String> listReportDir (String directory, String extension);

}