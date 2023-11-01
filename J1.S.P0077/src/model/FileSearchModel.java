/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.FileSearchController;
import view.View;

public class FileSearchModel{
    private FileSearchController search;
    private View display;

    public FileSearchModel(FileSearchController search, View display) {
        this.search = search;
        this.display = display;
    }

}
