package com.jira;

import com.jira.pojo.OutputData;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JIRA_GET {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://viki5497.atlassian.net";

		OutputData data = RestAssured.given().header("Content-Type", "application/json").auth().preemptive()
				.basic("vwaran133@gmail.com", "js1MJGGUXFZJkHXuxjp96B7E").when().get("/rest/api/2/search").then()
				.assertThat().statusCode(200).extract().as(OutputData.class);
		System.out.println(data.getTotal());

		for (int i = 0; i < data.getIssues().size(); i++) {
			System.out.println(data.getIssues().get(i).getKey() + " "
					+ data.getIssues().get(i).getFields().getIssuetype().getName());
		}
	}
}
