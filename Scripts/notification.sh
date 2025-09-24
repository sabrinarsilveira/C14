ls
echo "Testando"
pwd
sudo apt-get install mailutils
echo "Pipeline executado com sucesso!" | mail -s "Notificação do GitHub Actions" $EMAIL_DESTINATARIO