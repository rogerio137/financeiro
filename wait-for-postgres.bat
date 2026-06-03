@echo off

until pg_isready -h postgres -p 5432 -U postgres; do
  echo "Aguardando PostgreSQL..."
  sleep 2
done

exec "$@"
