/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hugol
 */
public class TableModelPessoa extends AbstractTableModel{
    
    private ArrayList<Pessoa> listaDePessoas;
    private String[] colunas = {"Nome Da Pessoa","Idade da pesssoa"};

    public TableModelPessoa() {
        this.listaDePessoas = new ArrayList<>();
    }
    
    
    
    public void addPessoa(Pessoa pPessoa){
        this.listaDePessoas.add(pPessoa);
        fireTableDataChanged();
    }
    public void removerPessoa(int rowIndex){
        this.listaDePessoas.remove(rowIndex);
        fireTableDataChanged();
    }
    public Pessoa getPessoa(int rowIndex){
        return this.listaDePessoas.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return this.listaDePessoas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return this.listaDePessoas.get(rowIndex).getNome();
                
            case 1:
                return this.listaDePessoas.get(rowIndex).getIdade();
            default:
                return this.listaDePessoas.get(rowIndex);
        }
        
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
    
}
