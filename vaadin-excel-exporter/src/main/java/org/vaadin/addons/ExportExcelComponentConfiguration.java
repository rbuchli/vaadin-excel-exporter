package org.vaadin.addons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.vaadin.addons.formatter.ColumnFormatter;

import com.vaadin.ui.Grid;
import com.vaadin.ui.Table;
import com.vaadin.ui.TreeTable;

/**
 *
 * @author Kartik Suba
 * 
 */
@GeneratePojoBuilder(
        intoPackage = "*.builder")
public class ExportExcelComponentConfiguration {

    Object[] visibleProperties;
    ArrayList<String> dateFormattingProperties;
    ArrayList<String> integerFormattingProperties;
    ArrayList<String> floatFormattingProperties;
    ArrayList<String> booleanFormattingProperties;
    String[] columnHeaderKeys;
    XSSFCellStyle tableHeaderStyle;
    XSSFCellStyle tableContentStyle;

    XSSFCellStyle rTableHeaderStyle = null;
    XSSFCellStyle rTableContentStyle = null;

    HashMap<Object, ColumnFormatter> columnFormatters = new LinkedHashMap<Object, ColumnFormatter>();

    Table table;

    Integer colRowFreeze = null;

    Grid grid;
    TreeTable treeTable;

    public Integer getColRowFreeze() {
        return this.colRowFreeze;
    }

    public void setColRowFreeze(final Integer colRowFreeze) {
        this.colRowFreeze = colRowFreeze;
    }

    public Table getTable() {
        return this.table;
    }

    public void setTable(final Table table) {
        this.table = table;
    }

    public Grid getGrid() {
        return this.grid;
    }

    public void setGrid(final Grid grid) {
        this.grid = grid;
    }

    public TreeTable getTreeTable() {
        return this.treeTable;
    }

    public void setTreeTable(final TreeTable treeTable) {
        this.treeTable = treeTable;
    }

    public XSSFCellStyle getrTableHeaderStyle() {
        return this.rTableHeaderStyle;
    }

    protected void setrTableHeaderStyle(final XSSFCellStyle rTableHeaderStyle) {
        this.rTableHeaderStyle = rTableHeaderStyle;
    }

    public XSSFCellStyle getrTableContentStyle() {
        return this.rTableContentStyle;
    }

    protected void setrTableContentStyle(final XSSFCellStyle rTableContentStyle) {
        this.rTableContentStyle = rTableContentStyle;
    }

    public ArrayList<String> getIntegerFormattingProperties() {
        return this.integerFormattingProperties;
    }

    public void setIntegerFormattingProperties(final ArrayList<String> integerFormattingProperties) {
        this.integerFormattingProperties = integerFormattingProperties;
    }

    public ArrayList<String> getFloatFormattingProperties() {
        return this.floatFormattingProperties;
    }

    public void setFloatFormattingProperties(final ArrayList<String> floatFormattingProperties) {
        this.floatFormattingProperties = floatFormattingProperties;
    }

    public ArrayList<String> getDateFormattingProperties() {
        return this.dateFormattingProperties;
    }

    public void setDateFormattingProperties(final ArrayList<String> dateFormattingProperties) {
        this.dateFormattingProperties = dateFormattingProperties;
    }

    public Object[] getVisibleProperties() {
        return this.visibleProperties;
    }

    public String[] getColumnHeaderKeys() {
        return this.columnHeaderKeys;
    }

    public XSSFCellStyle getTableHeaderStyle() {
        return this.tableHeaderStyle;
    }

    public XSSFCellStyle getTableContentStyle() {
        return this.tableContentStyle;
    }

    public void setVisibleProperties(final Object[] visibleProperties) {
        this.visibleProperties = visibleProperties;
    }

    public void setColumnHeaderKeys(final String[] columnHeaderKeys) {
        this.columnHeaderKeys = columnHeaderKeys;
    }

    public void setTableHeaderStyle(final XSSFCellStyle tableHeaderStyle) {
        this.tableHeaderStyle = tableHeaderStyle;
    }

    public void setTableContentStyle(final XSSFCellStyle tableContentStyle) {
        this.tableContentStyle = tableContentStyle;
    }

    public HashMap<Object, ColumnFormatter> getColumnFormatters() {
        return this.columnFormatters;
    }

    public void setColumnFormatters(final HashMap<Object, ColumnFormatter> columnFormatters) {
        this.columnFormatters = columnFormatters;
    }

    public ColumnFormatter getColumnFormatter(final Object columnId) {
        if (this.columnFormatters != null && !this.columnFormatters.isEmpty() && this.columnFormatters.containsKey(columnId)) {
            return this.columnFormatters.get(columnId);
        }
        return null;
    }

    public ArrayList<String> getBooleanFormattingProperties() {
        return this.booleanFormattingProperties;
    }

    public void setBooleanFormattingProperties(final ArrayList<String> booleanFormattingProperties) {
        this.booleanFormattingProperties = booleanFormattingProperties;
    }
}
