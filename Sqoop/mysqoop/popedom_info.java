// ORM class for table 'popedom_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jul 08 09:41:42 CST 2015
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class popedom_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer popedom_id;
  public Integer get_popedom_id() {
    return popedom_id;
  }
  public void set_popedom_id(Integer popedom_id) {
    this.popedom_id = popedom_id;
  }
  public popedom_info with_popedom_id(Integer popedom_id) {
    this.popedom_id = popedom_id;
    return this;
  }
  private String popedom_name;
  public String get_popedom_name() {
    return popedom_name;
  }
  public void set_popedom_name(String popedom_name) {
    this.popedom_name = popedom_name;
  }
  public popedom_info with_popedom_name(String popedom_name) {
    this.popedom_name = popedom_name;
    return this;
  }
  private String popedom_value;
  public String get_popedom_value() {
    return popedom_value;
  }
  public void set_popedom_value(String popedom_value) {
    this.popedom_value = popedom_value;
  }
  public popedom_info with_popedom_value(String popedom_value) {
    this.popedom_value = popedom_value;
    return this;
  }
  private Integer category_id;
  public Integer get_category_id() {
    return category_id;
  }
  public void set_category_id(Integer category_id) {
    this.category_id = category_id;
  }
  public popedom_info with_category_id(Integer category_id) {
    this.category_id = category_id;
    return this;
  }
  private String create_time;
  public String get_create_time() {
    return create_time;
  }
  public void set_create_time(String create_time) {
    this.create_time = create_time;
  }
  public popedom_info with_create_time(String create_time) {
    this.create_time = create_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof popedom_info)) {
      return false;
    }
    popedom_info that = (popedom_info) o;
    boolean equal = true;
    equal = equal && (this.popedom_id == null ? that.popedom_id == null : this.popedom_id.equals(that.popedom_id));
    equal = equal && (this.popedom_name == null ? that.popedom_name == null : this.popedom_name.equals(that.popedom_name));
    equal = equal && (this.popedom_value == null ? that.popedom_value == null : this.popedom_value.equals(that.popedom_value));
    equal = equal && (this.category_id == null ? that.category_id == null : this.category_id.equals(that.category_id));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof popedom_info)) {
      return false;
    }
    popedom_info that = (popedom_info) o;
    boolean equal = true;
    equal = equal && (this.popedom_id == null ? that.popedom_id == null : this.popedom_id.equals(that.popedom_id));
    equal = equal && (this.popedom_name == null ? that.popedom_name == null : this.popedom_name.equals(that.popedom_name));
    equal = equal && (this.popedom_value == null ? that.popedom_value == null : this.popedom_value.equals(that.popedom_value));
    equal = equal && (this.category_id == null ? that.category_id == null : this.category_id.equals(that.category_id));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.popedom_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.popedom_name = JdbcWritableBridge.readString(2, __dbResults);
    this.popedom_value = JdbcWritableBridge.readString(3, __dbResults);
    this.category_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.create_time = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.popedom_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.popedom_name = JdbcWritableBridge.readString(2, __dbResults);
    this.popedom_value = JdbcWritableBridge.readString(3, __dbResults);
    this.category_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.create_time = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(popedom_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(popedom_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(popedom_value, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(category_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(create_time, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(popedom_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(popedom_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(popedom_value, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(category_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(create_time, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.popedom_id = null;
    } else {
    this.popedom_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.popedom_name = null;
    } else {
    this.popedom_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.popedom_value = null;
    } else {
    this.popedom_value = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category_id = null;
    } else {
    this.category_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.popedom_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.popedom_id);
    }
    if (null == this.popedom_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, popedom_name);
    }
    if (null == this.popedom_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, popedom_value);
    }
    if (null == this.category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_id);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, create_time);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.popedom_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.popedom_id);
    }
    if (null == this.popedom_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, popedom_name);
    }
    if (null == this.popedom_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, popedom_value);
    }
    if (null == this.category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.category_id);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, create_time);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(popedom_id==null?"null":"" + popedom_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popedom_name==null?"null":popedom_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popedom_value==null?"null":popedom_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_id==null?"null":"" + category_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":create_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(popedom_id==null?"null":"" + popedom_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popedom_name==null?"null":popedom_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popedom_value==null?"null":popedom_value, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category_id==null?"null":"" + category_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":create_time, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.popedom_id = null; } else {
      this.popedom_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.popedom_name = null; } else {
      this.popedom_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.popedom_value = null; } else {
      this.popedom_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_id = null; } else {
      this.category_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.create_time = null; } else {
      this.create_time = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.popedom_id = null; } else {
      this.popedom_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.popedom_name = null; } else {
      this.popedom_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.popedom_value = null; } else {
      this.popedom_value = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.category_id = null; } else {
      this.category_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.create_time = null; } else {
      this.create_time = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    popedom_info o = (popedom_info) super.clone();
    return o;
  }

  public void clone0(popedom_info o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("popedom_id", this.popedom_id);
    __sqoop$field_map.put("popedom_name", this.popedom_name);
    __sqoop$field_map.put("popedom_value", this.popedom_value);
    __sqoop$field_map.put("category_id", this.category_id);
    __sqoop$field_map.put("create_time", this.create_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("popedom_id", this.popedom_id);
    __sqoop$field_map.put("popedom_name", this.popedom_name);
    __sqoop$field_map.put("popedom_value", this.popedom_value);
    __sqoop$field_map.put("category_id", this.category_id);
    __sqoop$field_map.put("create_time", this.create_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("popedom_id".equals(__fieldName)) {
      this.popedom_id = (Integer) __fieldVal;
    }
    else    if ("popedom_name".equals(__fieldName)) {
      this.popedom_name = (String) __fieldVal;
    }
    else    if ("popedom_value".equals(__fieldName)) {
      this.popedom_value = (String) __fieldVal;
    }
    else    if ("category_id".equals(__fieldName)) {
      this.category_id = (Integer) __fieldVal;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("popedom_id".equals(__fieldName)) {
      this.popedom_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("popedom_name".equals(__fieldName)) {
      this.popedom_name = (String) __fieldVal;
      return true;
    }
    else    if ("popedom_value".equals(__fieldName)) {
      this.popedom_value = (String) __fieldVal;
      return true;
    }
    else    if ("category_id".equals(__fieldName)) {
      this.category_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("create_time".equals(__fieldName)) {
      this.create_time = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
