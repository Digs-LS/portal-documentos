package com.mre.dpagro.portaldpagro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mre.dpagro.portaldpagro.entity.Documento;
import com.mre.dpagro.portaldpagro.service.DocumentoService;
import com.mre.dpagro.portaldpagro.utils.SortUtils;

@RestController
@RequestMapping("/documento")
public class DocumentoController {

	@Autowired
	private DocumentoService documentoService;

	@GetMapping("/lista")
	public String listarDocumentos(Model theModel, @RequestParam(required = false) String sort) {
		List<Documento> theDocumentos = null;
		
		if (sort != null) {
			int theSortField = Integer.parseInt(sort);
			theDocumentos = documentoService.getDocumentos(theSortField);
		} else {
			theDocumentos = documentoService.getDocumentos(SortUtils.DOCUMENTO);
		}
		
		theModel.addAttribute("documentos", theDocumentos);
		
		return "listar-documentos";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Documento theDocumento = new Documento();

		theModel.addAttribute("documento", theDocumento);

		return "documento-form";
	}

	@PostMapping("/saveDocumento")
	public String saveDocumento(@ModelAttribute("documento") Documento theDocumento) {

		documentoService.saveDocumento(theDocumento);

		return "redirect:/documento/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("documentoId") int theId, Model theModel) {

		Documento theDocumento = documentoService.getDocumento(theId);

		theModel.addAttribute("documento", theDocumento);

		return "documento-form";
	}

	@GetMapping("/delete")
	public String deleteDocumento(@RequestParam("documentoId") int theId) {

		documentoService.deleteDocumento(theId);

		return "redirect:/documento/list";
	}

	@GetMapping("/search")
	public String searchDocumentos(@RequestParam("theSearchName") String theSearchName, Model theModel) {

		List<Documento> theDocumentos = documentoService.searchDocumentos(theSearchName);

		theModel.addAttribute("documentos", theDocumentos);
		return "list-documentos";
	}
}
