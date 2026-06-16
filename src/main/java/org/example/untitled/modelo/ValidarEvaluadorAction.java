package org.example.untitled.modelo;

import org.openxava.actions.ViewBaseAction;

public class ValidarEvaluadorAction extends ViewBaseAction {

    public void execute() throws Exception {
        // 1. Obtenemos el objeto evaluador de la vista
        // getView().getValue("evaluador") devuelve un objeto, por eso lo casteamos a (Evaluador)
        Evaluador evaluador = (Evaluador) getView().getValue("evaluador");

        // 2. Validamos que el evaluador no sea nulo
        if (evaluador == null) {
            addError("Debe seleccionar un evaluador primero");
            return;
        }

        // 3. Validamos la lógica de negocio usando el punto (.) para llamar al método
        if (evaluador.getCapacidad() <= 0) {
            addError("El evaluador " + evaluador.getNombre() + " no tiene cupo disponible.");
        } else {
            addMessage("Evaluador " + evaluador.getNombre() + " válido para la asignación.");
        }
    }
}
