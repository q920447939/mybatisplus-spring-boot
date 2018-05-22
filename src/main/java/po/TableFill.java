/*  1:   */ package po;
/*  2:   */ 
/*  3:   */ import com.baomidou.mybatisplus.enums.FieldFill;
/*  4:   */ 
/*  5:   */ public class TableFill
/*  6:   */ {
/*  7:   */   private String fieldName;
/*  8:   */   private FieldFill fieldFill;
/*  9:   */   
/* 10:   */   private TableFill() {}
/* 11:   */   
/* 12:   */   public TableFill(String fieldName, FieldFill ignore)
/* 13:   */   {
/* 14:40 */     this.fieldName = fieldName;
/* 15:41 */     this.fieldFill = ignore;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getFieldName()
/* 19:   */   {
/* 20:45 */     return this.fieldName;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setFieldName(String fieldName)
/* 24:   */   {
/* 25:49 */     this.fieldName = fieldName;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public FieldFill getFieldFill()
/* 29:   */   {
/* 30:53 */     return this.fieldFill;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setFieldFill(FieldFill fieldFill)
/* 34:   */   {
/* 35:57 */     this.fieldFill = fieldFill;
/* 36:   */   }
/* 37:   */ }



/* Location:           C:\Users\win7\Desktop\mybatis-generator-1.0.0\mybatis-plus-generator.jar

 * Qualified Name:     BOOT-INF.classes.com.baomidou.mybatisplus.generator.config.po.TableFill

 * JD-Core Version:    0.7.0.1

 */