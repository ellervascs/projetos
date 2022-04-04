package com.br.ev.projetodl.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.br.ev.projetodl.model.Processos;

public class Controller {

	public static CloseableHttpClient clienteHttp = HttpClients.createDefault();

	public List<Processos> getProcesso(String numProcesso) throws Exception {
		List<Processos> lista = new ArrayList<Processos>();

		if (numProcesso != null || numProcesso != "") {
			HttpGet request = new HttpGet(
					"https://patentscope.wipo.int/search/pt/detail.jsf?docId=" + numProcesso + "&redirectedID=true");

			HttpResponse response = clienteHttp.execute(request);
			HttpEntity entity = response.getEntity();

			String strHtml = null;
			if (entity != null) {
				strHtml = EntityUtils.toString(entity);
			}

			Document doc = Jsoup.parse(strHtml);

			String numPublicacao = doc.select("span:contains(Número da publicação)").first().nextElementSibling()
					.text();

			String numPedido = null;
			if (doc.hasAttr("№ do pedido internacional")) {
				numPedido = doc.select("span:contains(№ do pedido internacional)").first().nextElementSibling().text();
			} else {
				numPedido = doc.select("span:contains(Número do pedido)").first().nextElementSibling().text();
			}

			String dataPublicacao = doc.select("span:contains(Data de publicação)").first().nextElementSibling().text();

			String requerentes = doc.select("span:contains(Requerentes)").first().nextElementSibling().text();

			String titulo = doc.select("span:contains(Título)").first().nextElementSibling().text();

			Processos processo = new Processos();
			processo.setNumeroPub(numPublicacao);
			processo.setNumeroPedido(numPedido);
			processo.setDataPub(dataPublicacao);
			processo.setRequerentes(requerentes);
			processo.setTitulo(titulo);
			lista.add(processo);

		}
		return lista;
	}

}
