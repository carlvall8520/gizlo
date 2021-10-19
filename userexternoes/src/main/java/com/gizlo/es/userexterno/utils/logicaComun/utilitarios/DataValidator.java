package com.gizlo.es.userexterno.utils.logicaComun.utilitarios;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gizlo.es.userexterno.utils.logicaComun.exception.ApplicationException;
import com.gizlo.es.userexterno.utils.logicaComun.exception.BusinessException;

public final class DataValidator {

	/**
	 * VALIDAMOS EL CONTENIDO DE UNA EXCEPCION DE NEGOCION "BusinessException" PARA
	 * DEFINIR EL CODIGO HTTP CORRESPONDIENTE
	 * 
	 * @param ex
	 * @return el dato de repuesta con el codigo Http correspondiente
	 */
	public static ResponseEntity<Object> validarResultado(BusinessException ex) {
		ResponseEntity<Object> respuesta;
		switch (ex.getError()) {
		case NO_ENCONTRADO:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("404").descripcion(ex.getMessage()),
					HttpStatus.NOT_FOUND);
			break;
		case SOLICITUD_INVALIDA:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("400").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		case SERVICIO_INACCESIBLE:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("502").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		case FUENTE_DE_DATOS:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("503").descripcion(ex.getMessage()),
					HttpStatus.SERVICE_UNAVAILABLE);
			break;
		case LOGICA_NEGOCIO:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("0004").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		default:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("500").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		}

		return respuesta;
	}

	/**
	 * VALIDAMOS EL CONTENIDO DE UNA EXCEPCION DE NEGOCION "ApplicationException"
	 * PARA DEFINIR EL CODIGO HTTP CORRESPONDIENTE
	 * 
	 * @param ex
	 * @return el dato de repuesta con el codigo Http correspondiente
	 */
	public static ResponseEntity<Respuesta> validarResultado(ApplicationException ex) {
		ResponseEntity<Respuesta> respuesta;
		switch (ex.getError()) {
		case NO_ENCONTRADO:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("404").descripcion(ex.getMessage()),
					HttpStatus.NOT_FOUND);
			break;
		case SOLICITUD_INVALIDA:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("400").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		case SERVICIO_INACCESIBLE:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("502").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		case FUENTE_DE_DATOS:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("503").descripcion(ex.getMessage()),
					HttpStatus.SERVICE_UNAVAILABLE);
			break;
		case LOGICA_NEGOCIO:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("0004").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		default:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("500").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		}

		return respuesta;
	}

	public static ResponseEntity<Object> validarResultadoObj(Object exe) {
		ResponseEntity<Object> respuesta;
		BusinessException ex = (BusinessException) exe;
		switch (ex.getError()) {
		case NO_ENCONTRADO:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("404").descripcion(ex.getMessage()),
					HttpStatus.NOT_FOUND);
			break;
		case SOLICITUD_INVALIDA:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("400").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		case SERVICIO_INACCESIBLE:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("502").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		case FUENTE_DE_DATOS:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("503").descripcion(ex.getMessage()),
					HttpStatus.SERVICE_UNAVAILABLE);
			break;
		case LOGICA_NEGOCIO:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("0004").descripcion(ex.getMessage()),
					HttpStatus.BAD_REQUEST);
			break;
		default:
			respuesta = new ResponseEntity<>(new Respuesta().codigoRespuesta("500").descripcion(ex.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
			break;
		}

		return respuesta;
	}
}
