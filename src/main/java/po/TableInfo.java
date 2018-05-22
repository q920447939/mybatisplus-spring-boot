/*   1:    */ package po;
/*   2:    */ 
/*   3:    */ import com.baomidou.mybatisplus.generator.config.StrategyConfig;
/*   4:    */ import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
/*   5:    */ import com.baomidou.mybatisplus.toolkit.CollectionUtils;
/*   6:    */ import com.baomidou.mybatisplus.toolkit.StringUtils;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.Arrays;
/*   9:    */ import java.util.HashSet;
/*  10:    */ import java.util.List;
/*  11:    */ import java.util.Set;
/*  12:    */ 
/*  13:    */ public class TableInfo
/*  14:    */ {
/*  15:    */   private boolean convert;
/*  16:    */   private String name;
/*  17:    */   private String comment;
/*  18:    */   private String entityName;
/*  19:    */   private String mapperName;
/*  20:    */   private String xmlName;
/*  21:    */   private String serviceName;
/*  22:    */   private String serviceImplName;
/*  23:    */   private String controllerName;
/*  24:    */   private List<TableField> fields;
/*  25:    */   private List<TableField> commonFields;
/*  26: 51 */   private List<String> importPackages = new ArrayList();
/*  27:    */   private String fieldNames;
/*  28:    */   
/*  29:    */   public boolean isConvert()
/*  30:    */   {
/*  31: 55 */     return this.convert;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void setConvert(StrategyConfig strategyConfig)
/*  35:    */   {
/*  36: 59 */     if (strategyConfig.containsTablePrefix(this.name)) {
/*  37: 61 */       this.convert = true;
/*  38: 62 */     } else if (strategyConfig.isCapitalModeNaming(this.name)) {
/*  39: 64 */       this.convert = false;
/*  40: 67 */     } else if (StrategyConfig.DB_COLUMN_UNDERLINE)
/*  41:    */     {
/*  42: 69 */       if (StringUtils.containsUpperCase(this.name)) {
/*  43: 70 */         this.convert = true;
/*  44:    */       }
/*  45:    */     }
/*  46: 72 */     else if (!this.entityName.equalsIgnoreCase(this.name)) {
/*  47: 73 */       this.convert = true;
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setConvert(boolean convert)
/*  52:    */   {
/*  53: 79 */     this.convert = convert;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getName()
/*  57:    */   {
/*  58: 83 */     return this.name;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setName(String name)
/*  62:    */   {
/*  63: 87 */     this.name = name;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getComment()
/*  67:    */   {
/*  68: 91 */     return this.comment;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setComment(String comment)
/*  72:    */   {
/*  73: 95 */     this.comment = comment;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getEntityPath()
/*  77:    */   {
/*  78: 99 */     StringBuilder ep = new StringBuilder();
/*  79:100 */     ep.append(this.entityName.substring(0, 1).toLowerCase());
/*  80:101 */     ep.append(this.entityName.substring(1));
/*  81:102 */     return ep.toString();
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getEntityName()
/*  85:    */   {
/*  86:106 */     return this.entityName;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setEntityName(StrategyConfig strategyConfig, String entityName)
/*  90:    */   {
/*  91:110 */     this.entityName = entityName;
/*  92:111 */     setConvert(strategyConfig);
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getMapperName()
/*  96:    */   {
/*  97:115 */     return this.mapperName;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setMapperName(String mapperName)
/* 101:    */   {
/* 102:119 */     this.mapperName = mapperName;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getXmlName()
/* 106:    */   {
/* 107:123 */     return this.xmlName;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setXmlName(String xmlName)
/* 111:    */   {
/* 112:127 */     this.xmlName = xmlName;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getServiceName()
/* 116:    */   {
/* 117:131 */     return this.serviceName;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setServiceName(String serviceName)
/* 121:    */   {
/* 122:135 */     this.serviceName = serviceName;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getServiceImplName()
/* 126:    */   {
/* 127:139 */     return this.serviceImplName;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setServiceImplName(String serviceImplName)
/* 131:    */   {
/* 132:143 */     this.serviceImplName = serviceImplName;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getControllerName()
/* 136:    */   {
/* 137:147 */     return this.controllerName;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setControllerName(String controllerName)
/* 141:    */   {
/* 142:151 */     this.controllerName = controllerName;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public List<TableField> getFields()
/* 146:    */   {
/* 147:155 */     return this.fields;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setFields(List<TableField> fields)
/* 151:    */   {
/* 152:159 */     if (CollectionUtils.isNotEmpty(fields))
/* 153:    */     {
/* 154:160 */       this.fields = fields;
/* 155:    */       
/* 156:162 */       Set<String> pkgSet = new HashSet();
/* 157:163 */       for (TableField field : fields)
/* 158:    */       {
/* 159:164 */         if ((null != field.getColumnType()) && (null != field.getColumnType().getPkg())) {
/* 160:165 */           pkgSet.add(field.getColumnType().getPkg());
/* 161:    */         }
/* 162:167 */         if (field.isKeyFlag())
/* 163:    */         {
/* 164:169 */           if ((field.isConvert()) || (field.isKeyIdentityFlag())) {
/* 165:170 */             pkgSet.add("com.baomidou.mybatisplus.annotations.TableId");
/* 166:    */           }
/* 167:173 */           if (field.isKeyIdentityFlag()) {
/* 168:174 */             pkgSet.add("com.baomidou.mybatisplus.enums.IdType");
/* 169:    */           }
/* 170:    */         }
/* 171:176 */         else if (field.isConvert())
/* 172:    */         {
/* 173:178 */           pkgSet.add("com.baomidou.mybatisplus.annotations.TableField");
/* 174:    */         }
/* 175:180 */         if (null != field.getFill())
/* 176:    */         {
/* 177:182 */           pkgSet.add("com.baomidou.mybatisplus.annotations.TableField");
/* 178:183 */           pkgSet.add("com.baomidou.mybatisplus.enums.FieldFill");
/* 179:    */         }
/* 180:    */       }
/* 181:186 */       if (!pkgSet.isEmpty()) {
/* 182:187 */         this.importPackages = new ArrayList(Arrays.asList(pkgSet.toArray(new String[0])));
/* 183:    */       }
/* 184:    */     }
/* 185:    */   }
/* 186:    */   
/* 187:    */   public List<TableField> getCommonFields()
/* 188:    */   {
/* 189:193 */     return this.commonFields;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setCommonFields(List<TableField> commonFields)
/* 193:    */   {
/* 194:197 */     this.commonFields = commonFields;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public List<String> getImportPackages()
/* 198:    */   {
/* 199:201 */     return this.importPackages;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setImportPackages(String pkg)
/* 203:    */   {
/* 204:205 */     this.importPackages.add(pkg);
/* 205:    */   }
/* 206:    */   
/* 207:    */   public boolean isLogicDelete(String logicDeletePropertyName)
/* 208:    */   {
/* 209:212 */     for (TableField tableField : this.fields) {
/* 210:213 */       if (tableField.getName().equals(logicDeletePropertyName)) {
/* 211:214 */         return true;
/* 212:    */       }
/* 213:    */     }
/* 214:217 */     return false;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getFieldNames()
/* 218:    */   {
/* 219:226 */     if (StringUtils.isEmpty(this.fieldNames))
/* 220:    */     {
/* 221:227 */       StringBuilder names = new StringBuilder();
/* 222:228 */       for (int i = 0; i < this.fields.size(); i++)
/* 223:    */       {
/* 224:229 */         TableField fd = (TableField)this.fields.get(i);
/* 225:230 */         if (i == this.fields.size() - 1) {
/* 226:231 */           names.append(cov2col(fd));
/* 227:    */         } else {
/* 228:233 */           names.append(cov2col(fd)).append(", ");
/* 229:    */         }
/* 230:    */       }
/* 231:236 */       this.fieldNames = names.toString();
/* 232:    */     }
/* 233:238 */     return this.fieldNames;
/* 234:    */   }
/* 235:    */   
/* 236:    */   private String cov2col(TableField field)
/* 237:    */   {
/* 238:248 */     if (null != field) {
/* 239:249 */       return field.isConvert() ? field.getName() + " AS " + field.getPropertyName() : field.getName();
/* 240:    */     }
/* 241:251 */     return "";
/* 242:    */   }
/* 243:    */ }



/* Location:           C:\Users\win7\Desktop\mybatis-generator-1.0.0\mybatis-plus-generator.jar

 * Qualified Name:     BOOT-INF.classes.com.baomidou.mybatisplus.generator.config.po.TableInfo

 * JD-Core Version:    0.7.0.1

 */