vault policy write quote_service quote_service_policy.hcl
vault policy write deployment deployment_policy.hcl

vault write database/config/postgresql @vault_postgres_connection.json
vault write database/roles/quotes_readonly @vault_postgres_role.json
