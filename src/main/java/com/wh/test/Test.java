package com.wh.test;

import com.wh.common.util.Result;
import com.wh.pojo.*;
import com.wh.service.EquipmentService;
import com.wh.service.OrderService;
import com.wh.service.PlanService;
import com.wh.service.ProductService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
//    添加设备
    @org.junit.Test
    public void EquaddTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        EquipmentService equipmentService = (EquipmentService) ac.getBean("equipmentService");
        Equipment equipment = new Equipment();
        equipment.setEquipment_seq("111");
        equipment.setEquipment_name("测试");
        equipmentService.addEqu(equipment);

    }
//    修改设备
    @org.junit.Test
    public void EquEdiTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        EquipmentService equipmentService = (EquipmentService) ac.getBean("equipmentService");
        Equipment equipment = new Equipment();
        equipment.setEquipment_seq("15926");
        equipment.setId(3);
        equipmentService.editEqu(equipment);
    }
//    删除设备
    @org.junit.Test
    public void EquDelTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        EquipmentService equipmentService = (EquipmentService) ac.getBean("equipmentService");
        Equipment equipment = new Equipment();
        equipment.setEquipment_seq("15926");
        equipment.setId(3);
        equipmentService.delEqu(equipment);
    }
//    通过设备名进行查找
    @org.junit.Test
    public void EquSelByNameTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        EquipmentService equipmentService = (EquipmentService) ac.getBean("equipmentService");
        String selName = "测";
        List<Equipment> equipmentList = equipmentService.selEquByName(selName);
        System.out.print(equipmentList);
    }
//    添加产品
    @org.junit.Test
    public void addProTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        ProductService productService = (ProductService) ac.getBean("productService");
        Product product = new Product();
        product.setId(101);
        product.setProduct_name("产品1");
        product.setProduct_num("001");
        product.setProduct_img_url("aa/aa");
        productService.addPro(product);
    }
//    修改产品
    @org.junit.Test
    public void editProTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        ProductService productService = (ProductService) ac.getBean("productService");
        Product product = new Product();
        product.setId(101);
        product.setProduct_name("产品名修改");
        productService.editPro(product);
    }
//    删除产品
@org.junit.Test
    public void delProTest(){
    ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
    ProductService productService = (ProductService) ac.getBean("productService");
    Product product = new Product();
    product.setId(101);
    productService.delPro(product);
}
//查询产品 按照产品名
@org.junit.Test
    public void selProByNameTest(){
    ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
    ProductService productService = (ProductService) ac.getBean("productService");
    String proName = "产";
    List<Product> productList =  productService.selProByName(proName);
    System.out.print(productList);
}
// 新建订单
@org.junit.Test
    public void addProOrdTest(){
    ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
    OrderService orderService = (OrderService) ac.getBean("orderService");
    Product_order order = new Product_order();
    order.setFlag(1);
    order.setCreate_userid(11);
    order.setUpdate_userid(11);
    order.setOrder_seq("o"+System.currentTimeMillis());
    order.setOrder_source(100);
    order.setProduct_id(1);
    order.setProduct_count(100);
    order.setOrder_status(10);
    order.setFactory_id(1);
    order.setFactory_yield(100);
    orderService.addProOrd(order);
}
    // 查询所有产品
    @org.junit.Test
    public void selAllProTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        ProductService productService = (ProductService) ac.getBean("productService");
        List<Product> productList = productService.selAllPro();
        System.out.print(new Result(0,"",10,productList).toString());
    }
    //    产品设备对应表添加
    @org.junit.Test
    public void EPAddTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        EquipmentService equipmentService = (EquipmentService) ac.getBean("equipmentService");
        Equipment_product equipment_product = new Equipment_product();
        equipment_product.setEquipment_id(111);
        equipment_product.setFactory_id(222);
        equipment_product.setProduct_id(333);
        equipment_product.setUnit(100);
        equipmentService.addEP(equipment_product);
    }
    //    产品设备对应表修改
    @org.junit.Test
    public void EPEditTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        EquipmentService equipmentService = (EquipmentService) ac.getBean("equipmentService");
        Equipment_product equipment_product = new Equipment_product();
        equipment_product.setId(1);
        equipment_product.setEquipment_id(999);
        equipment_product.setFactory_id(888);
        equipment_product.setProduct_id(777);
        equipment_product.setUnit(100);
        equipmentService.editEP(equipment_product);
    }
    //    产品设备对应表查询所有
    @org.junit.Test
    public void EPSelAllTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        EquipmentService equipmentService = (EquipmentService) ac.getBean("equipmentService");
        List<Equipment_product> equipment_productList = equipmentService.selAllEP();
        System.out.print(equipment_productList);
    }
    // 编辑订单
    @org.junit.Test
    public void editProOrdTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        OrderService orderService = (OrderService) ac.getBean("orderService");
        Product_order order = new Product_order();
        order.setId(1);
        order.setOrder_seq("修改");
        orderService.editProOrd(order);
    }
    // 删除订单
    @org.junit.Test
    public void delProOrdTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        OrderService orderService = (OrderService) ac.getBean("orderService");
        Product_order order = new Product_order();
        order.setId(1);
        orderService.delProOrd(order);
    }
    // 查询所有订单
    @org.junit.Test
    public void selAllProOrdTest(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        OrderService orderService = (OrderService) ac.getBean("orderService");
        List<Product_order> orderList = orderService.selAllProOrd();
        System.out.print(orderList);
    }
//  新建生产计划
    @org.junit.Test
    public void addPlanTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        PlanService planService = (PlanService) ac.getBean("planService");
        Product_plan product_plan = new Product_plan();
        product_plan.setFlag(1);
        product_plan.setCreate_userid(1);
        product_plan.setUpdate_userid(1);
        product_plan.setPlan_seq("aaa");
        product_plan.setOrder_id(1);
        product_plan.setProduct_id(1);
        product_plan.setPlan_count(100);
        product_plan.setPlan_status(10);
        product_plan.setFactory_id(1);
        planService.addPlan(product_plan);
    }
//  编辑生产计划
    @org.junit.Test
    public void editPlanTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        PlanService planService = (PlanService) ac.getBean("planService");
        Product_plan product_plan = new Product_plan();
        product_plan.setId(1);
        product_plan.setPlan_seq("xiugai");
        planService.editPlan(product_plan);
    }
//  删除生产计划
    @org.junit.Test
    public void delPlanTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        PlanService planService = (PlanService) ac.getBean("planService");
        Product_plan product_plan = new Product_plan();
        product_plan.setId(1);
        planService.delPlan(product_plan);
    }
//  查询所有生产计划
    @org.junit.Test
    public void selAllPlanTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        PlanService planService = (PlanService) ac.getBean("planService");
        List<Product_plan> planList = planService.selAllPlan();
        System.out.print(planList);
    }
//  查询生产计划按照生产编号
    @org.junit.Test
    public void selPlanBySeqTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        PlanService planService = (PlanService) ac.getBean("planService");
        Product_plan plan = new Product_plan();
        plan.setPlan_seq("aaa");
        List<Product_plan> planList = planService.selPlanBySep(plan);
        System.out.print(planList);
    }
}
