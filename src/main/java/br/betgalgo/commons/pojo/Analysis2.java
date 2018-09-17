package br.betgalgo.commons.pojo;

import java.io.Serializable;

import com.google.gson.annotations.JsonAdapter;

import br.betgalgo.commons.util.Analysis2Adapter;

@JsonAdapter(Analysis2Adapter.class)
public class Analysis2 extends AnalysisAb implements Serializable {

	private final static long serialVersionUID = -804285853206099694L;

}