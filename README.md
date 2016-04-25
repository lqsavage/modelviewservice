# Model View Service

Description:
--------------
Backend service of ViewModel(Nodejs frontend webapp)
Project set up in Intellij idea, Jetty can be used to start the service by running
```bash
jetty:run
```

API:
----
```html
GET http://localhost:8085/entity/{entityName}
http://localhost:8085/entitycolumn/{entityId}
```

Response
```json
{
  "entityName": "Claim",
  "businessValue": "**For Policy perspective**, we offer many more built-in car insurance discounts,",
  "entityBuilder": "<pre><code class='java'>public class ClassLazyTypeResolver extends LazyTypeResolver</code></pre>",
  "entityColumns": [
    {
      "foreignKey": null,
      "description": "Claim",
      "name": "Claim",
      "entityType": "VARCHAR"
    },
    {
      "foreignKey": null,
      "description": "AAA",
      "name": "AAA",
      "entityType": "VARCHAR"
    },
    {
      "foreignKey": null,
      "description": "Policy",
      "name": "Policy",
      "entityType": "Policy"
    },
    {
      "foreignKey": null,
      "description": "CreateTime",
      "name": "Claim",
      "entityType": "DATETIME"
    }
  ],
  "parentEntity": null
}

```

