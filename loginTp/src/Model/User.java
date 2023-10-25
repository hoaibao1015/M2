/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;

/**
 *
 * @author sonhu
 */
   public class User {
    private String accountNumber;
    private String password;
    private String captcha;

    public User(String accountNumber, String password, String captcha) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.captcha = captcha;
    }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getCaptcha() {
            return captcha;
        }

        public void setCaptcha(String captcha) {
            this.captcha = captcha;
        }

        @Override
        public String toString() {
            return "User{" + "accountNumber=" + accountNumber + ", password=" + password + ", captcha=" + captcha + '}';
        }


    }
