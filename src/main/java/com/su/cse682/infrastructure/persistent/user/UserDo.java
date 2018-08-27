package com.su.cse682.infrastructure.persistent.user;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author yirong.wang
*/
public class UserDo implements Serializable {

    private static final long serialVersionUID = 1535402824032L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String uuid;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime gmtCreate;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime gmtModified;

    /**
    * 
    * isNullAble:0
    */
    private String name;


    public void setUuid(String uuid){this.uuid = uuid;}

    public String getUuid(){return this.uuid;}

    public void setGmtCreate(java.time.LocalDateTime gmtCreate){this.gmtCreate = gmtCreate;}

    public java.time.LocalDateTime getGmtCreate(){return this.gmtCreate;}

    public void setGmtModified(java.time.LocalDateTime gmtModified){this.gmtModified = gmtModified;}

    public java.time.LocalDateTime getGmtModified(){return this.gmtModified;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}
    @Override
    public String toString() {
        return "UserDo{" +
                "uuid='" + uuid + '\'' +
                "gmtCreate='" + gmtCreate + '\'' +
                "gmtModified='" + gmtModified + '\'' +
                "name='" + name + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserDo set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserDo set){
            this.set = set;
            return this;
        }

        public UserDo getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends UserDo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> uuidList;

        public List<String> getUuidList(){return this.uuidList;}


        private List<String> fuzzyUuid;

        public List<String> getFuzzyUuid(){return this.fuzzyUuid;}

        private List<String> rightFuzzyUuid;

        public List<String> getRightFuzzyUuid(){return this.rightFuzzyUuid;}
        private List<java.time.LocalDateTime> gmtCreateList;

        public List<java.time.LocalDateTime> getGmtCreateList(){return this.gmtCreateList;}

        private java.time.LocalDateTime gmtCreateSt;

        private java.time.LocalDateTime gmtCreateEd;

        public java.time.LocalDateTime getGmtCreateSt(){return this.gmtCreateSt;}

        public java.time.LocalDateTime getGmtCreateEd(){return this.gmtCreateEd;}

        private List<java.time.LocalDateTime> gmtModifiedList;

        public List<java.time.LocalDateTime> getGmtModifiedList(){return this.gmtModifiedList;}

        private java.time.LocalDateTime gmtModifiedSt;

        private java.time.LocalDateTime gmtModifiedEd;

        public java.time.LocalDateTime getGmtModifiedSt(){return this.gmtModifiedSt;}

        public java.time.LocalDateTime getGmtModifiedEd(){return this.gmtModifiedEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyUuid (List<String> fuzzyUuid){
            this.fuzzyUuid = fuzzyUuid;
            return this;
        }

        public QueryBuilder fuzzyUuid (String ... fuzzyUuid){
            this.fuzzyUuid = solveNullList(fuzzyUuid);
            return this;
        }

        public QueryBuilder rightFuzzyUuid (List<String> rightFuzzyUuid){
            this.rightFuzzyUuid = rightFuzzyUuid;
            return this;
        }

        public QueryBuilder rightFuzzyUuid (String ... rightFuzzyUuid){
            this.rightFuzzyUuid = solveNullList(rightFuzzyUuid);
            return this;
        }

        public QueryBuilder uuid(String uuid){
            setUuid(uuid);
            return this;
        }

        public QueryBuilder uuidList(String ... uuid){
            this.uuidList = solveNullList(uuid);
            return this;
        }

        public QueryBuilder uuidList(List<String> uuid){
            this.uuidList = uuid;
            return this;
        }

        public QueryBuilder fetchUuid(){
            setFetchFields("fetchFields","uuid");
            return this;
        }

        public QueryBuilder excludeUuid(){
            setFetchFields("excludeFields","uuid");
            return this;
        }

        public QueryBuilder gmtCreateBetWeen(java.time.LocalDateTime gmtCreateSt,java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateSt = gmtCreateSt;
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }

        public QueryBuilder gmtCreateGreaterEqThan(java.time.LocalDateTime gmtCreateSt){
            this.gmtCreateSt = gmtCreateSt;
            return this;
        }
        public QueryBuilder gmtCreateLessEqThan(java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }


        public QueryBuilder gmtCreate(java.time.LocalDateTime gmtCreate){
            setGmtCreate(gmtCreate);
            return this;
        }

        public QueryBuilder gmtCreateList(java.time.LocalDateTime ... gmtCreate){
            this.gmtCreateList = solveNullList(gmtCreate);
            return this;
        }

        public QueryBuilder gmtCreateList(List<java.time.LocalDateTime> gmtCreate){
            this.gmtCreateList = gmtCreate;
            return this;
        }

        public QueryBuilder fetchGmtCreate(){
            setFetchFields("fetchFields","gmtCreate");
            return this;
        }

        public QueryBuilder excludeGmtCreate(){
            setFetchFields("excludeFields","gmtCreate");
            return this;
        }

        public QueryBuilder gmtModifiedBetWeen(java.time.LocalDateTime gmtModifiedSt,java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedSt = gmtModifiedSt;
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }

        public QueryBuilder gmtModifiedGreaterEqThan(java.time.LocalDateTime gmtModifiedSt){
            this.gmtModifiedSt = gmtModifiedSt;
            return this;
        }
        public QueryBuilder gmtModifiedLessEqThan(java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }


        public QueryBuilder gmtModified(java.time.LocalDateTime gmtModified){
            setGmtModified(gmtModified);
            return this;
        }

        public QueryBuilder gmtModifiedList(java.time.LocalDateTime ... gmtModified){
            this.gmtModifiedList = solveNullList(gmtModified);
            return this;
        }

        public QueryBuilder gmtModifiedList(List<java.time.LocalDateTime> gmtModified){
            this.gmtModifiedList = gmtModified;
            return this;
        }

        public QueryBuilder fetchGmtModified(){
            setFetchFields("fetchFields","gmtModified");
            return this;
        }

        public QueryBuilder excludeGmtModified(){
            setFetchFields("excludeFields","gmtModified");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public UserDo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> uuidList;

        public List<String> getUuidList(){return this.uuidList;}


        private List<String> fuzzyUuid;

        public List<String> getFuzzyUuid(){return this.fuzzyUuid;}

        private List<String> rightFuzzyUuid;

        public List<String> getRightFuzzyUuid(){return this.rightFuzzyUuid;}
        private List<java.time.LocalDateTime> gmtCreateList;

        public List<java.time.LocalDateTime> getGmtCreateList(){return this.gmtCreateList;}

        private java.time.LocalDateTime gmtCreateSt;

        private java.time.LocalDateTime gmtCreateEd;

        public java.time.LocalDateTime getGmtCreateSt(){return this.gmtCreateSt;}

        public java.time.LocalDateTime getGmtCreateEd(){return this.gmtCreateEd;}

        private List<java.time.LocalDateTime> gmtModifiedList;

        public List<java.time.LocalDateTime> getGmtModifiedList(){return this.gmtModifiedList;}

        private java.time.LocalDateTime gmtModifiedSt;

        private java.time.LocalDateTime gmtModifiedEd;

        public java.time.LocalDateTime getGmtModifiedSt(){return this.gmtModifiedSt;}

        public java.time.LocalDateTime getGmtModifiedEd(){return this.gmtModifiedEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}

        public ConditionBuilder fuzzyUuid (List<String> fuzzyUuid){
            this.fuzzyUuid = fuzzyUuid;
            return this;
        }

        public ConditionBuilder fuzzyUuid (String ... fuzzyUuid){
            this.fuzzyUuid = solveNullList(fuzzyUuid);
            return this;
        }

        public ConditionBuilder rightFuzzyUuid (List<String> rightFuzzyUuid){
            this.rightFuzzyUuid = rightFuzzyUuid;
            return this;
        }

        public ConditionBuilder rightFuzzyUuid (String ... rightFuzzyUuid){
            this.rightFuzzyUuid = solveNullList(rightFuzzyUuid);
            return this;
        }

        public ConditionBuilder uuidList(String ... uuid){
            this.uuidList = solveNullList(uuid);
            return this;
        }

        public ConditionBuilder uuidList(List<String> uuid){
            this.uuidList = uuid;
            return this;
        }

        public ConditionBuilder gmtCreateBetWeen(java.time.LocalDateTime gmtCreateSt,java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateSt = gmtCreateSt;
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }

        public ConditionBuilder gmtCreateGreaterEqThan(java.time.LocalDateTime gmtCreateSt){
            this.gmtCreateSt = gmtCreateSt;
            return this;
        }
        public ConditionBuilder gmtCreateLessEqThan(java.time.LocalDateTime gmtCreateEd){
            this.gmtCreateEd = gmtCreateEd;
            return this;
        }


        public ConditionBuilder gmtCreateList(java.time.LocalDateTime ... gmtCreate){
            this.gmtCreateList = solveNullList(gmtCreate);
            return this;
        }

        public ConditionBuilder gmtCreateList(List<java.time.LocalDateTime> gmtCreate){
            this.gmtCreateList = gmtCreate;
            return this;
        }

        public ConditionBuilder gmtModifiedBetWeen(java.time.LocalDateTime gmtModifiedSt,java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedSt = gmtModifiedSt;
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }

        public ConditionBuilder gmtModifiedGreaterEqThan(java.time.LocalDateTime gmtModifiedSt){
            this.gmtModifiedSt = gmtModifiedSt;
            return this;
        }
        public ConditionBuilder gmtModifiedLessEqThan(java.time.LocalDateTime gmtModifiedEd){
            this.gmtModifiedEd = gmtModifiedEd;
            return this;
        }


        public ConditionBuilder gmtModifiedList(java.time.LocalDateTime ... gmtModified){
            this.gmtModifiedList = solveNullList(gmtModified);
            return this;
        }

        public ConditionBuilder gmtModifiedList(List<java.time.LocalDateTime> gmtModified){
            this.gmtModifiedList = gmtModified;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private UserDo obj;

        public Builder(){
            this.obj = new UserDo();
        }

        public Builder uuid(String uuid){
            this.obj.setUuid(uuid);
            return this;
        }
        public Builder gmtCreate(java.time.LocalDateTime gmtCreate){
            this.obj.setGmtCreate(gmtCreate);
            return this;
        }
        public Builder gmtModified(java.time.LocalDateTime gmtModified){
            this.obj.setGmtModified(gmtModified);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public UserDo build(){return obj;}
    }

}
