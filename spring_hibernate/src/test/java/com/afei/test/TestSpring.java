�}ac  (  �2(���3*�e�����w�ک�*���t�d��z宷Cc�#mlV�&��U���U��T�U�i�r�4)�u�Hb*�~]�ģ�u�
SV��Lz</�}K-�Œ`��	�����o�����jj���ǃ���@��x��1�~ m�Je�G�.�d�wtE������3��ĩ��I�8�2шZ�]��u�l���{�����%|A!�K@�� �-�Z�s97����J�S�,|��u�Sc�����Μ�y��jK����?�.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
        IUserService userService = ac.getBean(UserService.class);
        userService.test();
        User user = new User();
        user.setName("xiao11");
        user.setPassword("xiao11");
        userService.save(user);
        log.info("addUser Success");
        log.info("i am happy");

    }
}
