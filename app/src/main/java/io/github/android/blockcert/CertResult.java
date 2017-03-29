package io.github.android.blockcert;

/**
 * Created by Yifan on 2017/3/27.
 */

public class CertResult {

    /**
     * name : Bachelor of Education
     * language : English
     * recipient : {"identityType":"studentId","givenName":"TEST1","familyName":"TEST1","identity":"4542432"}
     * assertion : {"issuedOn":"2017-03-27 1:2:24","type":"Assertion","uid":"5P85LunaLho2W54wOwsqNK8rBmgWqx1Q"}
     * signature : tonVoubNZoRxZXEFyxjB2Gc3JlYu0XJMxntQ+RjpxVgbogP1SpZ+RF3X+QesApqaVntSTBs9ESDAO4k7jTyXvI5aF0LWa4nQMzbLcnu5sbDW2uSVYV6JMNyCWD8LQSLDgFpzVU2Rd0lV4bs3Y0G7pA46+oCMrDkq8I0PyjWbOyY=
     * issuer : {"name":"University of Birmingham","url":"http://www.birmingham.ac.uk","email":"uob@bham.ac.uk","signer_pub_key":"http://www.birmingham.ac.uk/keys/bham_public_key.asc","type":"Issuer","id":"001"}
     * type : certificate
     * description : up to standard
     */

    private String name;
    private String language;
    private RecipientBean recipient;
    private AssertionBean assertion;
    private String signature;
    private IssuerBean issuer;
    private String type;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public RecipientBean getRecipient() {
        return recipient;
    }

    public void setRecipient(RecipientBean recipient) {
        this.recipient = recipient;
    }

    public AssertionBean getAssertion() {
        return assertion;
    }

    public void setAssertion(AssertionBean assertion) {
        this.assertion = assertion;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public IssuerBean getIssuer() {
        return issuer;
    }

    public void setIssuer(IssuerBean issuer) {
        this.issuer = issuer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class RecipientBean {
        /**
         * identityType : studentId
         * givenName : TEST1
         * familyName : TEST1
         * identity : 4542432
         */

        private String identityType;
        private String givenName;
        private String familyName;
        private String identity;

        public String getIdentityType() {
            return identityType;
        }

        public void setIdentityType(String identityType) {
            this.identityType = identityType;
        }

        public String getGivenName() {
            return givenName;
        }

        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public String getIdentity() {
            return identity;
        }

        public void setIdentity(String identity) {
            this.identity = identity;
        }
    }

    public static class AssertionBean {
        /**
         * issuedOn : 2017-03-27 1:2:24
         * type : Assertion
         * uid : 5P85LunaLho2W54wOwsqNK8rBmgWqx1Q
         */

        private String issuedOn;
        private String type;
        private String uid;

        public String getIssuedOn() {
            return issuedOn;
        }

        public void setIssuedOn(String issuedOn) {
            this.issuedOn = issuedOn;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }

    public static class IssuerBean {
        /**
         * name : University of Birmingham
         * url : http://www.birmingham.ac.uk
         * email : uob@bham.ac.uk
         * signer_pub_key : http://www.birmingham.ac.uk/keys/bham_public_key.asc
         * type : Issuer
         * id : 001
         */

        private String name;
        private String url;
        private String email;
        private String signer_pub_key;
        private String type;
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSigner_pub_key() {
            return signer_pub_key;
        }

        public void setSigner_pub_key(String signer_pub_key) {
            this.signer_pub_key = signer_pub_key;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
