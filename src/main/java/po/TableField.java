/*   1:    */ package po;
/*   2:    */ 
/*   3:    */ import com.baomidou.mybatisplus.generator.config.StrategyConfig;
/*   4:    */ import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
/*   5:    */ import com.baomidou.mybatisplus.toolkit.StringUtils;
/*   6:    */ 
/*   7:    */ public class TableField
/*   8:    */ {
/*   9:    */   private boolean convert;
/*  10:    */   private boolean keyFlag;
/*  11:    */   private boolean keyIdentityFlag;
/*  12:    */   private String name;
/*  13:    */   private String type;
/*  14:    */   private String propertyName;
/*  15:    */   private DbColumnType columnType;
/*  16:    */   private String comment;
/*  17:    */   private String fill;
/*  18:    */   
/*  19:    */   public boolean isConvert()
/*  20:    */   {
/*  21: 46 */     return this.convert;
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected void setConvert(StrategyConfig strategyConfig)
/*  25:    */   {
/*  26: 50 */     if (strategyConfig.isCapitalModeNaming(this.name)) {
/*  27: 51 */       this.convert = false;
/*  28: 54 */     } else if (StrategyConfig.DB_COLUMN_UNDERLINE)
/*  29:    */     {
/*  30: 56 */       if (StringUtils.containsUpperCase(this.name)) {
/*  31: 57 */         this.convert = true;
/*  32:    */       }
/*  33:    */     }
/*  34: 59 */     else if (!this.name.equals(this.propertyName)) {
/*  35: 60 */       this.convert = true;
/*  36:    */     }
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setConvert(boolean convert)
/*  40:    */   {
/*  41: 66 */     this.convert = convert;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean isKeyFlag()
/*  45:    */   {
/*  46: 70 */     return this.keyFlag;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setKeyFlag(boolean keyFlag)
/*  50:    */   {
/*  51: 74 */     this.keyFlag = keyFlag;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean isKeyIdentityFlag()
/*  55:    */   {
/*  56: 78 */     return this.keyIdentityFlag;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setKeyIdentityFlag(boolean keyIdentityFlag)
/*  60:    */   {
/*  61: 82 */     this.keyIdentityFlag = keyIdentityFlag;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getName()
/*  65:    */   {
/*  66: 86 */     return this.name;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setName(String name)
/*  70:    */   {
/*  71: 90 */     this.name = name;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getType()
/*  75:    */   {
/*  76: 94 */     return this.type;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setType(String type)
/*  80:    */   {
/*  81: 98 */     this.type = type;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getPropertyName()
/*  85:    */   {
/*  86:102 */     return this.propertyName;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setPropertyName(StrategyConfig strategyConfig, String propertyName)
/*  90:    */   {
/*  91:106 */     this.propertyName = propertyName;
/*  92:107 */     setConvert(strategyConfig);
/*  93:    */   }
/*  94:    */   
/*  95:    */   public DbColumnType getColumnType()
/*  96:    */   {
/*  97:111 */     return this.columnType;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setColumnType(DbColumnType columnType)
/* 101:    */   {
/* 102:115 */     this.columnType = columnType;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getPropertyType()
/* 106:    */   {
/* 107:119 */     if (null != this.columnType) {
/* 108:120 */       return this.columnType.getType();
/* 109:    */     }
/* 110:122 */     return null;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getComment()
/* 114:    */   {
/* 115:126 */     return this.comment;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setComment(String comment)
/* 119:    */   {
/* 120:130 */     this.comment = comment;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getCapitalName()
/* 124:    */   {
/* 125:137 */     if (this.propertyName.length() <= 1) {
/* 126:138 */       return this.propertyName.toUpperCase();
/* 127:    */     }
/* 128:140 */     String setGetName = this.propertyName;
/* 129:141 */     if (DbColumnType.BASE_BOOLEAN.getType().equalsIgnoreCase(this.columnType.getType())) {
/* 130:142 */       setGetName = StringUtils.removeIsPrefixIfBoolean(setGetName, Boolean.class);
/* 131:    */     }
/* 132:145 */     String firstChar = setGetName.substring(0, 1);
/* 133:146 */     if ((Character.isLowerCase(firstChar.toCharArray()[0])) && 
/* 134:147 */       (Character.isUpperCase(setGetName.substring(1, 2).toCharArray()[0]))) {
/* 135:148 */       return firstChar.toLowerCase() + setGetName.substring(1);
/* 136:    */     }
/* 137:150 */     return firstChar.toUpperCase() + setGetName.substring(1);
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getFill()
/* 141:    */   {
/* 142:154 */     return this.fill;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setFill(String fill)
/* 146:    */   {
/* 147:158 */     this.fill = fill;
/* 148:    */   }
/* 149:    */ }



/* Location:           C:\Users\win7\Desktop\mybatis-generator-1.0.0\mybatis-plus-generator.jar

 * Qualified Name:     BOOT-INF.classes.com.baomidou.mybatisplus.generator.config.po.TableField

 * JD-Core Version:    0.7.0.1

 */