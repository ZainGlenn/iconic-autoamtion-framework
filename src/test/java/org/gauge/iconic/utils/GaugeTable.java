package org.gauge.iconic.utils;

import com.thoughtworks.gauge.TableRow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Usage:
 * In spec File, create a table like example:
 * | Key        | Value     |
 * | Name       | Jack      |
 */
public class GaugeTable {
    private final com.thoughtworks.gauge.Table table;

    public GaugeTable(com.thoughtworks.gauge.Table table) {
        this.table = table;
    }

    /**
     * In your Steps / page class, use like this:
     * GaugeTable gTable = new GaugeTable(table); //this table argument comes from the spec file
     * String name = gTable.getValue("Name");
     */
    public String getValue(String key) {
        List<TableRow> rows = table.getTableRows();

        if (rows.stream().noneMatch(s -> s.getCellValues().get(0).equals(key))) {
            return null;
        }

        List<TableRow> rowList = rows.stream().filter(s -> s.getCellValues().get(0).equals(key)).collect(Collectors.toList());
        if (rowList.size() < 1) {
            return null;
        }
        TableRow row = rowList.get(0);

        if (row.getCellValues().size() < 1) {
            return null;
        }
        return row.getCellValues().get(1);
    }

    public List<String> getKeyListFromGaugeTable() {
        List<String> keyList = new ArrayList<>();

        List<TableRow> rows = table.getTableRows();
        for (TableRow s : rows) {
            String cellValue = s.getCellValues().get(0);
            if (cellValue.trim().replaceAll("-", "").isEmpty()) {
                continue;
            }
            keyList.add(cellValue);
        }

        if (keyList.size() == 0) {
            return null;
        }
        return keyList;
    }

    public HashMap<String, String> tableToMap() {
        HashMap<String, String> map = new HashMap<>();
        for (String key : this.getKeyListFromGaugeTable()) {
            map.put(key, this.getValue(key).strip());
        }
        return map;
    }

}
