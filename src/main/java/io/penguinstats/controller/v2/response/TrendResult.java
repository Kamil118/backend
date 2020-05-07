package io.penguinstats.controller.v2.response;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendResult implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("trend")
	private Map<String, StageTrend> stageTrendMap;

}