package br.betgalgo.commons.pojo;

import java.io.Serializable;

import com.google.gson.annotations.JsonAdapter;

import br.betgalgo.commons.util.AnalysisAdapter;

@JsonAdapter(AnalysisAdapter.class)
public class Analysis extends AnalysisAb implements Serializable {

	private static final long serialVersionUID = -4160716070458249666L;
	
}