class EjercicioPN12:
  def main():
    worked_hours = 48
    hour_price = 5000
    gross_salary = worked_hours * hour_price
    witholding = gross_salary * 0.125
    net_salary = gross_salary - witholding
    print(f"Horas trabajadas: {worked_hours} ")
    print(f"Precio por hora: {hour_price} ")
    print(f"Salario bruto: {gross_salary} ")
    print(f"Retencion en la fuente: {witholding} ")
    print(f"Salario neto: {net_salary} ")


EjercicioPN12.main()
