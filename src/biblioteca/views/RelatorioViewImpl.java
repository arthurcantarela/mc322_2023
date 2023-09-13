package biblioteca.views;

import java.util.List;

import biblioteca.controllers.RelatorioController;
import biblioteca.models.ItemMultimidia;

public class RelatorioViewImpl implements RelatorioView {
    private RelatorioController relatorioController;

    public RelatorioViewImpl(RelatorioController controller) {
        relatorioController = controller;
    }
}