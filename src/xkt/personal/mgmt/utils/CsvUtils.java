package xkt.personal.mgmt.utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;

public class CsvUtils {

	/**
	 * 生成CSV
	 * @param retMapList
	 * @return
	 */
	@SuppressWarnings("all")
	public static void createCSV(List<Map> retMapList,String[] head, String[] keys,ServletOutputStream out) {

        // 表格头
        List<String> headList = Arrays.asList(head);
        //数据
        List<List<String>> dataList = new ArrayList<List<String>>();
        for (int i=1;i<retMapList.size()+1;i++) {
            List<String> rowList = new ArrayList<String>();
            Map map = retMapList.get(i-1);
            for(int k =0;k<keys.length;k++){
                String value = (String) map.get(keys[k]);
                rowList.add(value);
            }
            dataList.add(rowList);
        }
        BufferedWriter csvWtriter = null;
        try {

            csvWtriter = new BufferedWriter(new OutputStreamWriter(out, "GBK"), 1024);
            // 写入文件头部
            writeRow(headList, csvWtriter);
            // 写入文件内容
            for (List<String> row : dataList) {
                writeRow(row, csvWtriter);
            }
            csvWtriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                csvWtriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeRow(List<String> row, BufferedWriter csvWriter) throws IOException {

        // 写入文件头部
        for (String data : row) {
            StringBuffer sb = new StringBuffer();
            String rowStr = sb.append("\"").append(data).append("\",").toString();
            csvWriter.write(rowStr);
        }
        csvWriter.newLine();
    }
}
