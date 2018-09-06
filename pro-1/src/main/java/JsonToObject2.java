import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;

public class JsonToObject2 {

    /**
     * json多余字段不解析
     * 注意：key中必须不能有空格！
     * @param args
     */
    public static void main(String[] args) {
        //String value= "{ \"method\": \"add\", \"code \": \"wang \", \"name \": \"whb \", \"ownerUserCode \": \"w \", \"creatorUserCode \": \"whb \", \"yarnQueueProd \": \"test1 \", \"yarnQueueDev \": \"t1 \", \"gatewayQueueProd \": \"t2 \", \"gatewayQueueDev \": \" t3 \", \" dbNameProd \": \" t4 \", \" dbNameDev \": \" t5 \", \" hadoopAccount \": \" t6 \" }";
        //String value= "{ \"method\": \"add\", \"code\":\"ww\",\"name\": \"whb\",}";
        String value = "{ \"method\": \"add\", \"code\": \"wang\", \"name\": \"whb\", \"ownerUserCode\": \"w \", \"creatorUserCode\": \"whb \", \"yarnQueueProd\": \"test1 \", \"yarnQueueDev\": \"t1 \", \"gatewayQueueProd\": \"t2 \", \"gatewayQueueDev\": \" t3 \", \"dbNameProd\": \" t4 \", \"dbNameDev\": \" t5 \", \"hadoopAccount\": \" t6 \" }";
        ObjectMapper mapper = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);;
        ProjectEntity projectEntity = null;
        try {
            projectEntity = mapper.readValue(value,ProjectEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(projectEntity);

    }
    public static class ProjectEntity{
        private static final long serialVersionUID = 7716241087333713855L;
        /** 主键 */
        private Long id;
        /** 项目编号(用户填写) */
        private String code;
        /** 项目名 */
        private String name;
        private String remark;
        /** 项目owner的用户编号(邮箱前缀) */
        private String ownerUserCode;
        /** 成本中心 */
        private String costCenter;
        /** 生产线 */
        private String productLine;
        /** 需求方 */
        private String demandSide;
        /** 版本号 */
        private Integer version;

        /**
         * 生产yarn队列
         */
        private String yarnQueueProd;
        /**
         * 开发yarn队列
         */
        private String yarnQueueDev;
        /**
         * 生产gateway队列
         */
        private String gatewayQueueProd;
        /**
         * 开发gateway队列
         */
        private String gatewayQueueDev;
        /**
         * 生产db库
         */
        private String dbNameProd;
        /**
         * 开发db库
         */
        private String dbNameDev;
        /**
         * 生产账号
         */
        private String hadoopAccount;

        private LocalDateTime createTime;
        private String creatorUserCode;
        private LocalDateTime updateTime;
        private LocalDateTime deleteTime;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getOwnerUserCode() {
            return ownerUserCode;
        }

        public void setOwnerUserCode(String ownerUserCode) {
            this.ownerUserCode = ownerUserCode;
        }

        public String getCostCenter() {
            return costCenter;
        }

        public void setCostCenter(String costCenter) {
            this.costCenter = costCenter;
        }

        public String getProductLine() {
            return productLine;
        }

        public void setProductLine(String productLine) {
            this.productLine = productLine;
        }

        public String getDemandSide() {
            return demandSide;
        }

        public void setDemandSide(String demandSide) {
            this.demandSide = demandSide;
        }

        public Integer getVersion() {
            return version;
        }

        public void setVersion(Integer version) {
            this.version = version;
        }


        public LocalDateTime getCreateTime() {
            return createTime;
        }

        public void setCreateTime(LocalDateTime createTime) {
            this.createTime = createTime;
        }

        public String getCreatorUserCode() {
            return creatorUserCode;
        }

        public void setCreatorUserCode(String creatorUserCode) {
            this.creatorUserCode = creatorUserCode;
        }

        public LocalDateTime getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(LocalDateTime updateTime) {
            this.updateTime = updateTime;
        }

        public LocalDateTime getDeleteTime() {
            return deleteTime;
        }

        public void setDeleteTime(LocalDateTime deleteTime) {
            this.deleteTime = deleteTime;
        }


        public String getYarnQueueProd() {
            return yarnQueueProd;
        }

        public void setYarnQueueProd(String yarnQueueProd) {
            this.yarnQueueProd = yarnQueueProd;
        }

        public String getYarnQueueDev() {
            return yarnQueueDev;
        }

        public void setYarnQueueDev(String yarnQueueDev) {
            this.yarnQueueDev = yarnQueueDev;
        }

        public String getGatewayQueueProd() {
            return gatewayQueueProd;
        }

        public void setGatewayQueueProd(String gatewayQueueProd) {
            this.gatewayQueueProd = gatewayQueueProd;
        }

        public String getGatewayQueueDev() {
            return gatewayQueueDev;
        }

        public void setGatewayQueueDev(String gatewayQueueDev) {
            this.gatewayQueueDev = gatewayQueueDev;
        }

        public String getDbNameProd() {
            return dbNameProd;
        }

        public void setDbNameProd(String dbNameProd) {
            this.dbNameProd = dbNameProd;
        }

        public String getDbNameDev() {
            return dbNameDev;
        }

        public void setDbNameDev(String dbNameDev) {
            this.dbNameDev = dbNameDev;
        }

        public String getHadoopAccount() {
            return hadoopAccount;
        }

        public void setHadoopAccount(String hadoopAccount) {
            this.hadoopAccount = hadoopAccount;
        }

        @Override
        public String toString() {
            return "ProjectEntity{" +
                    "code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    ", remark='" + remark + '\'' +
                    ", ownerUserCode='" + ownerUserCode + '\'' +
                    ", costCenter='" + costCenter + '\'' +
                    ", productLine='" + productLine + '\'' +
                    ", demandSide='" + demandSide + '\'' +
                    ", version=" + version +
                    ", yarnQueueProd='" + yarnQueueProd + '\'' +
                    ", yarnQueueDev='" + yarnQueueDev + '\'' +
                    ", gatewayQueueProd='" + gatewayQueueProd + '\'' +
                    ", gatewayQueueDev='" + gatewayQueueDev + '\'' +
                    ", dbNameProd='" + dbNameProd + '\'' +
                    ", dbNameDev='" + dbNameDev + '\'' +
                    ", hadoopAccount='" + hadoopAccount + '\'' +
                    ", createTime=" + createTime +
                    ", creatorUserCode='" + creatorUserCode + '\'' +
                    ", updateTime=" + updateTime +
                    ", deleteTime=" + deleteTime +
                    '}';
        }
    }
}
