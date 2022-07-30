public class SmallMediumEnterprise extends Corporate {
        private String enterpriseNumber;
        private String scale;

        public SmallMediumEnterprise() {
            super();
        }

        public SmallMediumEnterprise(int id, String userName, String password, String email, String address,String companyName, String taxNumber,String enterpriseNumber, String scale) {
            super(id, userName, password, email, address,companyName, taxNumber);
            this.enterpriseNumber = enterpriseNumber;
            this.scale = scale;
        }

        public String getEnterpriseNumber() {
            return enterpriseNumber;
        }

        public void setEnterpriseNumber(String enterpriseNumber) {
            this.enterpriseNumber = enterpriseNumber;
        }

        public String getScale() {
            return scale;
        }

        public void setScale(String scale) {
            this.scale = scale;
        }




    }

