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
public class UserAuthDo implements Serializable {

    private static final long serialVersionUID = 1535405414089L;


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
    private String userId;

    /**
    * 
    * isNullAble:0
    */
    private String identityType;

    /**
    * 
    * isNullAble:0
    */
    private String identifier;

    /**
    * 
    * isNullAble:1
    */
    private String credential;


    public void setUuid(String uuid){this.uuid = uuid;}

    public String getUuid(){return this.uuid;}

    public void setGmtCreate(java.time.LocalDateTime gmtCreate){this.gmtCreate = gmtCreate;}

    public java.time.LocalDateTime getGmtCreate(){return this.gmtCreate;}

    public void setGmtModified(java.time.LocalDateTime gmtModified){this.gmtModified = gmtModified;}

    public java.time.LocalDateTime getGmtModified(){return this.gmtModified;}

    public void setUserId(String userId){this.userId = userId;}

    public String getUserId(){return this.userId;}

    public void setIdentityType(String identityType){this.identityType = identityType;}

    public String getIdentityType(){return this.identityType;}

    public void setIdentifier(String identifier){this.identifier = identifier;}

    public String getIdentifier(){return this.identifier;}

    public void setCredential(String credential){this.credential = credential;}

    public String getCredential(){return this.credential;}
    @Override
    public String toString() {
        return "UserAuthDo{" +
                "uuid='" + uuid + '\'' +
                "gmtCreate='" + gmtCreate + '\'' +
                "gmtModified='" + gmtModified + '\'' +
                "userId='" + userId + '\'' +
                "identityType='" + identityType + '\'' +
                "identifier='" + identifier + '\'' +
                "credential='" + credential + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserAuthDo set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserAuthDo set){
            this.set = set;
            return this;
        }

        public UserAuthDo getSet(){
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

    public static class QueryBuilder extends UserAuthDo{
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

        private List<String> userIdList;

        public List<String> getUserIdList(){return this.userIdList;}


        private List<String> fuzzyUserId;

        public List<String> getFuzzyUserId(){return this.fuzzyUserId;}

        private List<String> rightFuzzyUserId;

        public List<String> getRightFuzzyUserId(){return this.rightFuzzyUserId;}
        private List<String> identityTypeList;

        public List<String> getIdentityTypeList(){return this.identityTypeList;}


        private List<String> fuzzyIdentityType;

        public List<String> getFuzzyIdentityType(){return this.fuzzyIdentityType;}

        private List<String> rightFuzzyIdentityType;

        public List<String> getRightFuzzyIdentityType(){return this.rightFuzzyIdentityType;}
        private List<String> identifierList;

        public List<String> getIdentifierList(){return this.identifierList;}


        private List<String> fuzzyIdentifier;

        public List<String> getFuzzyIdentifier(){return this.fuzzyIdentifier;}

        private List<String> rightFuzzyIdentifier;

        public List<String> getRightFuzzyIdentifier(){return this.rightFuzzyIdentifier;}
        private List<String> credentialList;

        public List<String> getCredentialList(){return this.credentialList;}


        private List<String> fuzzyCredential;

        public List<String> getFuzzyCredential(){return this.fuzzyCredential;}

        private List<String> rightFuzzyCredential;

        public List<String> getRightFuzzyCredential(){return this.rightFuzzyCredential;}
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

        public QueryBuilder fuzzyUserId (List<String> fuzzyUserId){
            this.fuzzyUserId = fuzzyUserId;
            return this;
        }

        public QueryBuilder fuzzyUserId (String ... fuzzyUserId){
            this.fuzzyUserId = solveNullList(fuzzyUserId);
            return this;
        }

        public QueryBuilder rightFuzzyUserId (List<String> rightFuzzyUserId){
            this.rightFuzzyUserId = rightFuzzyUserId;
            return this;
        }

        public QueryBuilder rightFuzzyUserId (String ... rightFuzzyUserId){
            this.rightFuzzyUserId = solveNullList(rightFuzzyUserId);
            return this;
        }

        public QueryBuilder userId(String userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(String ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public QueryBuilder userIdList(List<String> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }

        public QueryBuilder fuzzyIdentityType (List<String> fuzzyIdentityType){
            this.fuzzyIdentityType = fuzzyIdentityType;
            return this;
        }

        public QueryBuilder fuzzyIdentityType (String ... fuzzyIdentityType){
            this.fuzzyIdentityType = solveNullList(fuzzyIdentityType);
            return this;
        }

        public QueryBuilder rightFuzzyIdentityType (List<String> rightFuzzyIdentityType){
            this.rightFuzzyIdentityType = rightFuzzyIdentityType;
            return this;
        }

        public QueryBuilder rightFuzzyIdentityType (String ... rightFuzzyIdentityType){
            this.rightFuzzyIdentityType = solveNullList(rightFuzzyIdentityType);
            return this;
        }

        public QueryBuilder identityType(String identityType){
            setIdentityType(identityType);
            return this;
        }

        public QueryBuilder identityTypeList(String ... identityType){
            this.identityTypeList = solveNullList(identityType);
            return this;
        }

        public QueryBuilder identityTypeList(List<String> identityType){
            this.identityTypeList = identityType;
            return this;
        }

        public QueryBuilder fetchIdentityType(){
            setFetchFields("fetchFields","identityType");
            return this;
        }

        public QueryBuilder excludeIdentityType(){
            setFetchFields("excludeFields","identityType");
            return this;
        }

        public QueryBuilder fuzzyIdentifier (List<String> fuzzyIdentifier){
            this.fuzzyIdentifier = fuzzyIdentifier;
            return this;
        }

        public QueryBuilder fuzzyIdentifier (String ... fuzzyIdentifier){
            this.fuzzyIdentifier = solveNullList(fuzzyIdentifier);
            return this;
        }

        public QueryBuilder rightFuzzyIdentifier (List<String> rightFuzzyIdentifier){
            this.rightFuzzyIdentifier = rightFuzzyIdentifier;
            return this;
        }

        public QueryBuilder rightFuzzyIdentifier (String ... rightFuzzyIdentifier){
            this.rightFuzzyIdentifier = solveNullList(rightFuzzyIdentifier);
            return this;
        }

        public QueryBuilder identifier(String identifier){
            setIdentifier(identifier);
            return this;
        }

        public QueryBuilder identifierList(String ... identifier){
            this.identifierList = solveNullList(identifier);
            return this;
        }

        public QueryBuilder identifierList(List<String> identifier){
            this.identifierList = identifier;
            return this;
        }

        public QueryBuilder fetchIdentifier(){
            setFetchFields("fetchFields","identifier");
            return this;
        }

        public QueryBuilder excludeIdentifier(){
            setFetchFields("excludeFields","identifier");
            return this;
        }

        public QueryBuilder fuzzyCredential (List<String> fuzzyCredential){
            this.fuzzyCredential = fuzzyCredential;
            return this;
        }

        public QueryBuilder fuzzyCredential (String ... fuzzyCredential){
            this.fuzzyCredential = solveNullList(fuzzyCredential);
            return this;
        }

        public QueryBuilder rightFuzzyCredential (List<String> rightFuzzyCredential){
            this.rightFuzzyCredential = rightFuzzyCredential;
            return this;
        }

        public QueryBuilder rightFuzzyCredential (String ... rightFuzzyCredential){
            this.rightFuzzyCredential = solveNullList(rightFuzzyCredential);
            return this;
        }

        public QueryBuilder credential(String credential){
            setCredential(credential);
            return this;
        }

        public QueryBuilder credentialList(String ... credential){
            this.credentialList = solveNullList(credential);
            return this;
        }

        public QueryBuilder credentialList(List<String> credential){
            this.credentialList = credential;
            return this;
        }

        public QueryBuilder fetchCredential(){
            setFetchFields("fetchFields","credential");
            return this;
        }

        public QueryBuilder excludeCredential(){
            setFetchFields("excludeFields","credential");
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

        public UserAuthDo build(){return this;}
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

        private List<String> userIdList;

        public List<String> getUserIdList(){return this.userIdList;}


        private List<String> fuzzyUserId;

        public List<String> getFuzzyUserId(){return this.fuzzyUserId;}

        private List<String> rightFuzzyUserId;

        public List<String> getRightFuzzyUserId(){return this.rightFuzzyUserId;}
        private List<String> identityTypeList;

        public List<String> getIdentityTypeList(){return this.identityTypeList;}


        private List<String> fuzzyIdentityType;

        public List<String> getFuzzyIdentityType(){return this.fuzzyIdentityType;}

        private List<String> rightFuzzyIdentityType;

        public List<String> getRightFuzzyIdentityType(){return this.rightFuzzyIdentityType;}
        private List<String> identifierList;

        public List<String> getIdentifierList(){return this.identifierList;}


        private List<String> fuzzyIdentifier;

        public List<String> getFuzzyIdentifier(){return this.fuzzyIdentifier;}

        private List<String> rightFuzzyIdentifier;

        public List<String> getRightFuzzyIdentifier(){return this.rightFuzzyIdentifier;}
        private List<String> credentialList;

        public List<String> getCredentialList(){return this.credentialList;}


        private List<String> fuzzyCredential;

        public List<String> getFuzzyCredential(){return this.fuzzyCredential;}

        private List<String> rightFuzzyCredential;

        public List<String> getRightFuzzyCredential(){return this.rightFuzzyCredential;}

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

        public ConditionBuilder fuzzyUserId (List<String> fuzzyUserId){
            this.fuzzyUserId = fuzzyUserId;
            return this;
        }

        public ConditionBuilder fuzzyUserId (String ... fuzzyUserId){
            this.fuzzyUserId = solveNullList(fuzzyUserId);
            return this;
        }

        public ConditionBuilder rightFuzzyUserId (List<String> rightFuzzyUserId){
            this.rightFuzzyUserId = rightFuzzyUserId;
            return this;
        }

        public ConditionBuilder rightFuzzyUserId (String ... rightFuzzyUserId){
            this.rightFuzzyUserId = solveNullList(rightFuzzyUserId);
            return this;
        }

        public ConditionBuilder userIdList(String ... userId){
            this.userIdList = solveNullList(userId);
            return this;
        }

        public ConditionBuilder userIdList(List<String> userId){
            this.userIdList = userId;
            return this;
        }

        public ConditionBuilder fuzzyIdentityType (List<String> fuzzyIdentityType){
            this.fuzzyIdentityType = fuzzyIdentityType;
            return this;
        }

        public ConditionBuilder fuzzyIdentityType (String ... fuzzyIdentityType){
            this.fuzzyIdentityType = solveNullList(fuzzyIdentityType);
            return this;
        }

        public ConditionBuilder rightFuzzyIdentityType (List<String> rightFuzzyIdentityType){
            this.rightFuzzyIdentityType = rightFuzzyIdentityType;
            return this;
        }

        public ConditionBuilder rightFuzzyIdentityType (String ... rightFuzzyIdentityType){
            this.rightFuzzyIdentityType = solveNullList(rightFuzzyIdentityType);
            return this;
        }

        public ConditionBuilder identityTypeList(String ... identityType){
            this.identityTypeList = solveNullList(identityType);
            return this;
        }

        public ConditionBuilder identityTypeList(List<String> identityType){
            this.identityTypeList = identityType;
            return this;
        }

        public ConditionBuilder fuzzyIdentifier (List<String> fuzzyIdentifier){
            this.fuzzyIdentifier = fuzzyIdentifier;
            return this;
        }

        public ConditionBuilder fuzzyIdentifier (String ... fuzzyIdentifier){
            this.fuzzyIdentifier = solveNullList(fuzzyIdentifier);
            return this;
        }

        public ConditionBuilder rightFuzzyIdentifier (List<String> rightFuzzyIdentifier){
            this.rightFuzzyIdentifier = rightFuzzyIdentifier;
            return this;
        }

        public ConditionBuilder rightFuzzyIdentifier (String ... rightFuzzyIdentifier){
            this.rightFuzzyIdentifier = solveNullList(rightFuzzyIdentifier);
            return this;
        }

        public ConditionBuilder identifierList(String ... identifier){
            this.identifierList = solveNullList(identifier);
            return this;
        }

        public ConditionBuilder identifierList(List<String> identifier){
            this.identifierList = identifier;
            return this;
        }

        public ConditionBuilder fuzzyCredential (List<String> fuzzyCredential){
            this.fuzzyCredential = fuzzyCredential;
            return this;
        }

        public ConditionBuilder fuzzyCredential (String ... fuzzyCredential){
            this.fuzzyCredential = solveNullList(fuzzyCredential);
            return this;
        }

        public ConditionBuilder rightFuzzyCredential (List<String> rightFuzzyCredential){
            this.rightFuzzyCredential = rightFuzzyCredential;
            return this;
        }

        public ConditionBuilder rightFuzzyCredential (String ... rightFuzzyCredential){
            this.rightFuzzyCredential = solveNullList(rightFuzzyCredential);
            return this;
        }

        public ConditionBuilder credentialList(String ... credential){
            this.credentialList = solveNullList(credential);
            return this;
        }

        public ConditionBuilder credentialList(List<String> credential){
            this.credentialList = credential;
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

        private UserAuthDo obj;

        public Builder(){
            this.obj = new UserAuthDo();
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
        public Builder userId(String userId){
            this.obj.setUserId(userId);
            return this;
        }
        public Builder identityType(String identityType){
            this.obj.setIdentityType(identityType);
            return this;
        }
        public Builder identifier(String identifier){
            this.obj.setIdentifier(identifier);
            return this;
        }
        public Builder credential(String credential){
            this.obj.setCredential(credential);
            return this;
        }
        public UserAuthDo build(){return obj;}
    }

}
