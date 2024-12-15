-- Construya las siguientes consultas:
-- Construir las consultas para insertar, modificar y eliminar un Proveedor, Compra y Detalle Compra (DetCompra).

-- Insertar valores:
insert into Proveedor (RUT, Nombre) values ("10654789-8","Cecinas sureñas");
insert INTO Compra (NumeroFactura, Fecha, Total, Proveedor_Rut) values (78945613789, TO_DATE("2024-12-15", "YYYY-MM-DD"), 5000, "10654789-8");
insert into DetCompra (Compra_NumeroFactura, ID, Cantidad, Descripcion, Unitario, Inventario_ID) VALUES (78945613789, 1, 10, "Cecinas especiales", 100, 2001);

-- Modificar un Proveedor:
update Proveedor set Nombre = "Cecinas surenas" where RUT = "10654789-8";
update DetCompra set Cantidad = 15 where ID = 1 and Compra_NumeroFactura = 78945613789;
update Compra set Total = 1500 where NumeroFactura = 78945613789;

-- Eliminar a un proveedor:
delete from DetCompra where ID = 1 and Compra_NumeroFactura = 78945613789;
delete from Compra where NumeroFactura = 78945613789;
delete from Proveedor where RUT = "10654789-8";
-- //////////////////////////////////////////////////////////////////////////////

-- Listar todas las compras con los datos del cliente dado un año y mes.
select v.FechaVenta, v.NumeroFactura, c.RUT, c.Nombre, c.Giro, c.Direccion, c.Ciudad, c.Fono, v.Total
from Venta v
join Cliente c on c.RUT = v.Cliente_RUT
where year(v.FechaVenta) = 2024
and month(v.FechaVenta) = 5;
-- //////////////////////////////////////////////////////////////////////////////
-- Listar Número, Fecha y Total de todas las compras y ventas.
-- Compras
select NumeroFactura, Fecha as FechaCompra, Total from Compra;
-- Ventas
select NumeroFactura, FechaVenta, Total from Venta; 
-- //////////////////////////////////////////////////////////////////////////////
-- Listar todas las producciones el año 2020 que contengan las 5 cecinas más vendidas.
with CecinasMasVendidas as (
	select dv.Cecina_ID as ID_Cecina,
		sum(dv.Cantidad) as TotalVendidas
	from
		DetVenta dv
    join
		Venta v on dv.Venta_NumeroFactura = v.NumeroFactura
	where
		year(v.FechaVenta) = 2020
	group by
		dv.Cecina_ID
	order by
		TotalVendidas desc
	limit 5
    )
select
	p.ID as Produccion_ID,
    pp.Nombre as Nombre_Planta,
    p.FechaTermino as anio_Produccion,
    c.Nombre as Nombre_Cecina,
    cmv.TotalVendidas
from
	Produccion p
join
	PlantaProd pp on p.PlantaProd_ID = pp.ID
join
	DetProduccion dp on dp.Produccion_ID = p.ID
join
	receta r on r.ID = dp.Receta_ID
join
	DetReceta dr on dr.Receta_ID = r.ID
join
	Cecina c on c.ID =  dr.Cecina_ID
join 
	CecinasMasVendidas cmv on cmv.ID_Cecina = c.ID
where
	year(p.FechaTermino) = 2020;






